import fs from 'node:fs'
import path from 'node:path'
import util from 'node:util'

import camelcase from 'camelcase'
import { parse as parseCDDL, type PropertyReference, type Property, type Group, type Assignment } from 'cddl'

import { writeFile } from './utils.js'
import { CDDL_PARSE_ERROR_MESSAGE } from './constants.js'

type Scope = string
type FileName = string
type MapKey = [Scope, FileName]

function parseCDDLFile (filePath: string) {
    let ast

    try {
        console.log('!!!', filePath)
        ast = parseCDDL(filePath)
    } catch (err) {
        console.log(util.format(CDDL_PARSE_ERROR_MESSAGE, `Failed to parse ${filePath}: ${(err as Error).stack}`))
        process.exit(0)
    }

    /**
     * CDDL ast transformation
     * Unfortunately the CDDL can not be always correctly transformed into TypeScript
     * Therefor we need to make some adjustments here:
     *
     * - remove CommandData and Extensible from Command group
     */
    const commandGroup = ast.findIndex((a) => a.Name === 'Command')
    if (commandGroup !== -1) {
        (ast[commandGroup] as Group).Properties = [(ast[commandGroup] as Group).Properties[0]]
    }

    /**
     * have groups with method property extend from Command group
     */
    const commandGroups = ast.filter((a) => (
        a.Type === 'group' &&
        a.Properties &&
        a.Properties[0] &&
        (a.Properties[0] as Property).Name === 'method'
    )) as Group[]

    for (const g of commandGroups) {
        g.Properties.push({
            HasCut: false,
            Occurrence: { n: 1, m: 1 },
            Name: '',
            Type: [{ Type: 'group', Value: 'Command', Unwrapped: false }],
            Comments: []
        })
    }

    return ast
}

async function createModules (assignments: Assignment[]) {
    const javaFiles = new Map<MapKey, string>()
    for (const assignment of assignments) {
        /**
         * only create methods for groups that have a method property and therefor are commands that
         * receive a certain result
         */
        if (assignment.Type !== 'group' || assignment.Properties.length === 0 || (assignment.Properties[0] as Property).Name !== 'method') {
            continue
        }

        const responseType = assignments.find((a) => camelcase(a.Name) === `${camelcase(assignment.Name)}Result`)
        const methodId = (((assignment.Properties[0] as Property).Type as PropertyReference[])[0]).Value as string
        const paramName = (((assignment.Properties[1] as Property).Type as PropertyReference[])[0]).Value as string

        // Extract scope and command from assignment name
        const [scope, command] = assignment.Name.split('.')
        const moduleScope = (scope[0].toUpperCase() + scope.slice(1)) as string

        // Handle parameter class name - safely extract from paramName
        let paramClass: string
        const paramParts = paramName.split('.')
        if (paramParts.length > 1) {
            // Parameter has a scope prefix (e.g., 'session.Capabilities')
            const paramScope = paramParts[0]
            paramClass = paramParts[1][0].toUpperCase() + paramParts[1].slice(1)
        } else {
            // Parameter doesn't have a scope prefix
            paramClass = paramName[0].toUpperCase() + paramName.slice(1)
        }

        // Properly format parameter type
        const paramType = `${paramClass}`

        // Handle return type - should be in same package
        const resultTypeJava = responseType
            ? resultName(responseType.Name)
            : 'EmptyResult'

        // Adjust result type to proper package reference if it's EmptyResult
        const resultTypeJavaEmbed = responseType
            ? resultTypeJava
            : 'org.openqa.selenium.bidirectional.EmptyResult'

        const paramKey = 'params'
        const specUrl = `https://w3c.github.io/webdriver-bidi/#command-${methodId.replace('.', '-')}`
        const description = `WebDriver Bidi command to send command method "${methodId}" with parameters.`
        const c = [
            '*',
            ` * ${description}`,
            ` * @url ${specUrl}`,
            ` * @param parameters \`${paramType}\` {@link ${specUrl} | command parameter}`,
            ` * @return Command object with result type for ${methodId}`,
            ' *'
        ]

        const mapKey: MapKey = [moduleScope, `${moduleScope}Module`]
        if (!javaFiles.has(mapKey)) {
            javaFiles.set(mapKey, `package org.openqa.selenium.bidirectional.${scope.toLowerCase()};

import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto generated class for running WebDriver BiDi ${scope.toLowerCase()} commands in Java
 */
public class ${moduleScope}Module {
`)
        }

        let code = javaFiles.get(mapKey) as string

        code += `
    /*${c.join('\n    ')}/
    public Command<${resultTypeJavaEmbed}> ${command} (${paramType} parameters) {
        return new Command<>(
            "${methodId}",
            parameters.asMap(),
            ${resultTypeJavaEmbed}.class
        );
    }`
        javaFiles.set(mapKey, code)
    }

    return javaFiles
}

// Helper function to get correct class name for result types
function resultName(name: string): string {
    if (!name.includes('.')) {
        return name[0].toUpperCase() + name.slice(1);
    }

    const [scope, resultName] = name.split('.');
    return resultName[0].toUpperCase() + resultName.slice(1);
}

async function createPropertyClasses (assignments: Assignment[]) {
    const javaPropFiles = new Map<MapKey, string>()
    for (const assignment of assignments) {
        /**
         * only create methods for groups that have a method property and therefor are commands that
         * receive a certain result
         */
        if (!(assignment.Type !== 'group' || assignment.Properties.length === 0 || (assignment.Properties[0] as Property).Name !== 'method')) {
            continue
        }

        /**
         * some commands have no scope, e.g. "Command"
         */
        if (!assignment.Name.includes('.')) {
            continue
        }

        const scopeCamelCase = assignment.Name.split('.')[0][0].toUpperCase() + assignment.Name.split('.')[0].slice(1)
        if ('Properties' in assignment) {
            const prop = assignment.Name.split('.')[1]
            const propClassName = prop[0].toUpperCase() + prop.slice(1)
            const mapKey: MapKey = [scopeCamelCase, propClassName]

            const props = new Map<string, { type: string, isLiteral: boolean }>()
            for (const property of assignment.Properties) {
                if (Array.isArray(property) || !property.Name) {
                    continue
                }

                const { type, isLiteral } = parseType(property.Type)
                if (type === 'Unknown') {
                    console.log(`Unknown property type: please adjust "parseType" function to handle ${JSON.stringify(property, null, 2)}`)
                }

                props.set(property.Name, { type, isLiteral })
            }

            if (props.size > 0) {
                let code = ''
                if (!javaPropFiles.has(mapKey)) {
                    code += `package org.openqa.selenium.bidirectional.${scopeCamelCase.toLowerCase()};

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for ${assignment.Name} command
 */
public class ${propClassName} {
`
                }

                const assignableProps = Array.from(props.entries()).filter(([_, { isLiteral }]) => !isLiteral)
                const literalProps = Array.from(props.entries()).filter(([_, { isLiteral }]) => isLiteral)

                // Add constructor
                code += `
    /**
     * Creates a new ${propClassName} instance
     */
    public ${propClassName}(${assignableProps.map(([prop, { type }]) => `${type} ${prop}`).join(', ')}) {
        ${assignableProps.map(([prop]) => `this.${prop} = ${prop};`).join(`
        `)}
        ${literalProps.map(([prop, { type }]) => `this.${prop} = "${type}";`).join(`
        `)}
    }
`
                // Add properties and getters
                for (const [prop, { type }] of props.entries()) {
                    const propNameCamelCase = prop[0].toUpperCase() + prop.slice(1)
                    code += `
    private final ${type} ${prop};

    /**
     * Gets the ${prop} property
     * @return ${type} value
     */
    public ${type} get${propNameCamelCase}() {
        return this.${prop};
    }
`
                }

                // Add asMap method for command parameters
                code += `
    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        ${Array.from(props.entries()).map(([prop]) =>
          `toReturn.put("${prop}", this.${prop});`
        ).join(`
        `)}
        return toReturn;
    }
`
                javaPropFiles.set(mapKey, code)
            }
        }
    }

    return javaPropFiles
}

function parseType (specType: any): { type: string, isLiteral: boolean } {
    let type = 'Unknown'
    let isLiteral = false

    // Handle null or undefined type
    if (!specType) {
        return { type: 'Object', isLiteral }
    }

    // Special case: Handle complex nested properties directly (e.g., capabilities)
    if (typeof specType === 'object' && !Array.isArray(specType) &&
        'Name' in specType && 'Type' in specType && Array.isArray(specType.Type) &&
        specType.Type.length === 1 && typeof specType.Type[0] === 'object' &&
        specType.Type[0].Type === 'group' && 'Properties' in specType.Type[0]) {

        // This is a complex nested property object with its own property set
        // For now, use a generic Map type but we could generate actual model classes for these
        return { type: 'Map<String, Object>', isLiteral: false }
    }

    // Handle complex single object with Type field (not in an array)
    if (!Array.isArray(specType) && typeof specType === 'object' && 'Type' in specType) {
        // Handle nested group with properties
        if (specType.Type === 'group' && 'Properties' in specType) {
            return { type: 'Map<String, Object>', isLiteral: false }
        }

        // Convert to array format for unified processing
        specType = [specType]
    }

    if (!Array.isArray(specType)) {
        return { type: 'Object', isLiteral }
    }

    // Handle empty arrays
    if (specType.length === 0) {
        return { type: 'Object', isLiteral }
    }

    // Handle single value types
    if (specType.length === 1) {
        if (specType[0] === 'bool') {
            type = 'Boolean'
        } else if (specType[0] === 'int') {
            type = 'Integer'
        } else if (specType[0] === 'float') {
            type = 'Float'
        } else if ((specType[0] === 'string' || specType[0] === 'text')) {
            type = 'String'
        } else if (specType[0] === 'null') {
            type = 'Object'  // null is represented as Object in Java
        } else if (specType[0] === 'any') {
            type = 'Object'
        } else if (typeof specType[0] === 'object') {
            // Handle various object types
            if ('Type' in specType[0]) {
                const objType = specType[0].Type

                if (objType === 'group') {
                    if ('Name' in specType[0] && specType[0].Name && 'Properties' in specType[0]) {
                        // Group with properties - map to a custom class or Map
                        if (specType[0].Properties && Array.isArray(specType[0].Properties) &&
                            specType[0].Properties.length > 0 &&
                            specType[0].Properties.some((p: any) => p.Name === 'text')) {
                            // Special case for text attributes
                            type = 'Map<String, String>'
                        } else {
                            type = 'Map<String, Object>'
                        }
                    } else if ('Value' in specType[0] && typeof specType[0].Value === 'string') {
                        // Named group reference
                        if (specType[0].Value === 'js-int') {
                            type = 'Integer'
                        } else if (specType[0].Value === 'js-uint') {
                            type = 'Long'
                        } else if (specType[0].Value === 'Extensible') {
                            type = 'Map<String, Object>'
                        } else {
                            // Reference to another type - keep proper casing
                            const parts = specType[0].Value.split('.');
                            if (parts.length > 1) {
                                // Handle scoped types (e.g., 'session.Subscription')
                                const scope = parts[0][0].toUpperCase() + parts[0].slice(1);
                                const typeName = parts[1][0].toUpperCase() + parts[1].slice(1);
                                type = `${scope}.${typeName}`;
                            } else {
                                // Simple type
                                type = specType[0].Value[0].toUpperCase() + specType[0].Value.slice(1);
                            }
                        }
                    }
                } else if (objType === 'float') {
                    type = 'Float'
                } else if (objType === 'range') {
                    // For range types, use the appropriate numeric type
                    if (specType[0].Value && typeof specType[0].Value === 'object') {
                        if (specType[0].Value.Min && specType[0].Value.Min.Value !== undefined) {
                            const minVal = specType[0].Value.Min.Value;
                            if (Number.isInteger(minVal)) {
                                type = 'Integer';
                            } else {
                                type = 'Float';
                            }
                        } else {
                            type = 'Float'; // Default for ranges
                        }
                    } else {
                        type = 'Float'; // Default for ranges
                    }
                } else if (objType === 'literal' && 'Value' in specType[0] && specType[0].Value !== undefined) {
                    isLiteral = true;
                    type = typeof specType[0].Value === 'string' ?
                           specType[0].Value :
                           String(specType[0].Value);
                } else if (objType === 'array' && 'Values' in specType[0]) {
                    // Handle array types properly
                    const valueType = parseType(specType[0].Values).type;
                    type = `List<${valueType}>`;
                    return { type, isLiteral: false }; // Arrays are not literals
                } else if (objType === 'map') {
                    type = 'Map<String, Object>';
                }
            }

            // Handle type with operator (default values)
            if ('Operator' in specType[0] && specType[0].Operator) {
                // Handle the bool type with default operator
                if (specType[0].Type === 'bool') {
                    return { type: 'Boolean', isLiteral: false };
                }

                // Handle range or group type with operator
                if (typeof specType[0].Type === 'object' && 'Type' in specType[0].Type) {
                    if (specType[0].Type.Type === 'range') {
                        // For ranges, determine type based on min/max values
                        return { type: 'Float', isLiteral: false };
                    } else if (specType[0].Type.Type === 'group') {
                        // For groups with operators, extract the base type
                        if (specType[0].Type.Value === 'js-uint') {
                            return { type: 'Long', isLiteral: false };
                        } else {
                            // For other group references, use the referenced type
                            const parts = specType[0].Type.Value.split('.');
                            if (parts.length > 1) {
                                const scope = parts[0][0].toUpperCase() + parts[0].slice(1);
                                const typeName = parts[1][0].toUpperCase() + parts[1].slice(1);
                                return { type: `${scope}.${typeName}`, isLiteral: false };
                            }
                        }
                    }
                }

                // Generic fallback for types with operators
                const baseType: string = typeof specType[0].Type === 'string'
                    ? specType[0].Type === 'bool' ? 'Boolean' : 'Object'
                    : parseType([{ Type: specType[0].Type.Type, Value: specType[0].Type.Value }]).type;
                return { type: baseType, isLiteral };
            }
        }
    } else {
        // Multiple types represent a union - use most common superclass or interface
        // For simplicity, we'll use Object for unions
        type = 'Object';
    }

    return { type, isLiteral }
}

async function createJavaFiles (javaFiles: Map<MapKey, string>, outputDir: string) {
    for (const [[moduleScope, moduleName], code] of javaFiles.entries()) {
        const rootDir = path.join(outputDir, moduleScope)

        await fs.mkdirSync(rootDir, { recursive: true })
        await writeFile(path.resolve(rootDir, `${moduleName}.java`), code + '\n}')
    }
}

async function createResultClasses (assignments: Assignment[]) {
    const javaResultFiles = new Map<MapKey, string>()
    for (const assignment of assignments) {
        /**
         * only create result classes for result types
         */
        if (!assignment.Name.includes('Result')) {
            continue
        }

        /**
         * skip empty result
         */
        if (assignment.Name === 'EmptyResult') {
            continue
        }

        /**
         * some results have no scope, skip them
         */
        if (!assignment.Name.includes('.')) {
            continue
        }

        const [scope, resultName] = assignment.Name.split('.')
        const scopeCamelCase = scope[0].toUpperCase() + scope.slice(1)
        const resultClassName = resultName[0].toUpperCase() + resultName.slice(1)
        const mapKey: MapKey = [scopeCamelCase, resultClassName]

        // Special case for session.NewResult - skip and handle separately
        if (assignment.Name === 'session.NewResult') {
            const newResultCode = `package org.openqa.selenium.bidirectional.session;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents response for session.NewResult command
 */
public class NewResult {

    /**
     * Creates a new NewResult instance
     */
    public NewResult(String sessionId, Map<String, Object> capabilitiesMap) {
        this.sessionId = sessionId;
        this.capabilities = new Capabilities(capabilitiesMap);
    }

    private final String sessionId;

    /**
     * Gets the sessionId property
     * @return String value
     */
    public String getSessionId() {
        return this.sessionId;
    }

    private final Capabilities capabilities;

    /**
     * Gets the capabilities property
     * @return Capabilities value
     */
    public Capabilities getCapabilities() {
        return this.capabilities;
    }
}`;
            javaResultFiles.set(mapKey, newResultCode);
            continue;
        }

        const props = new Map<string, { type: string, isLiteral: boolean }>()

        if ('Properties' in assignment && assignment.Properties) {
            for (const property of assignment.Properties) {
                if (Array.isArray(property) || !property.Name) {
                    continue
                }

                const { type, isLiteral } = parseType(property.Type)
                if (type === 'Unknown') {
                    console.log(`Unknown property type in result class: please adjust "parseType" function to handle ${JSON.stringify(property, null, 2)}`)
                }

                props.set(property.Name, { type, isLiteral })
            }
        }

        let code = `package org.openqa.selenium.bidirectional.${scopeCamelCase.toLowerCase()};

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents response for ${assignment.Name} command
 */
public class ${resultClassName} {
`

        if (props.size > 0) {
            // Add constructor
            code += `
    /**
     * Creates a new ${resultClassName} instance
     */
    public ${resultClassName}(${Array.from(props.entries()).map(([prop, { type }]) =>
        `${type} ${prop}`).join(', ')}) {
        ${Array.from(props.entries()).map(([prop]) =>
          `this.${prop} = ${prop};`).join(`
        `)}
    }

`
            // Add properties and getters
            for (const [prop, { type }] of props.entries()) {
                const propNameCamelCase = prop[0].toUpperCase() + prop.slice(1)
                code += `
    private final ${type} ${prop};

    /**
     * Gets the ${prop} property
     * @return ${type} value
     */
    public ${type} get${propNameCamelCase}() {
        return this.${prop};
    }
`
            }

        } else {
            // Empty constructor for classes without properties
            code += `
    /**
     * Creates a new ${resultClassName} instance
     */
    public ${resultClassName}() {
        // No properties to initialize
    }
`
        }

        javaResultFiles.set(mapKey, code)
    }

    return javaResultFiles
}

async function createEmptyResultClass(outputDir: string) {
    const emptyResultContent = `package org.openqa.selenium.bidirectional;

/**
 * Represents an empty result from a WebDriver BiDi command
 */
public class EmptyResult {
    /**
     * Creates a new EmptyResult instance
     */
    public EmptyResult() {
        // Empty result has no properties
    }
}
`;

    await fs.mkdirSync(path.join(outputDir), { recursive: true });
    await writeFile(path.resolve(outputDir, 'EmptyResult.java'), emptyResultContent);
}

async function createHelperClasses(assignments: Assignment[], outputDir: string) {
    // Create enum classes for common types used with specific values
    const enumDefinitions = new Map<string, string[]>();

    // Find enum-like types in the CDDL that could be represented as Java enums
    for (const assignment of assignments) {
        if (assignment.Type === 'group' && assignment.Name.includes('.') &&
            assignment.Name.endsWith('Type')) {
            // This is likely an enum type
            const [scope, typeName] = assignment.Name.split('.');
            const scopePascal = scope[0].toUpperCase() + scope.slice(1);
            const typeNamePascal = typeName[0].toUpperCase() + typeName.slice(1);

            // Check if we can extract enum values
            if (Array.isArray(assignment.Properties) && assignment.Properties.length > 0) {
                // Skip enums that are already handled as standard types
                if (['PointerType', 'Origin'].includes(typeName)) {
                    const enumValues: string[] = [];

                    // Look for literal values that define the enum
                    for (const prop of assignment.Properties) {
                        if (!Array.isArray(prop) && 'Type' in prop &&
                            Array.isArray(prop.Type) && prop.Type.length === 1 &&
                            typeof prop.Type[0] === 'object' && prop.Type[0].Type === 'literal') {
                            enumValues.push(prop.Type[0].Value as string);
                        }
                    }

                    if (enumValues.length > 0) {
                        enumDefinitions.set(`${scopePascal}.${typeNamePascal}`, enumValues);
                    }
                }
            }
        }
    }

    // Create PointerType enum - explicitly defined because it's commonly used
    const pointerTypeContent = `package org.openqa.selenium.bidirectional.input;

/**
 * Represents pointer types in WebDriver BiDi protocol
 */
public enum PointerType {
    MOUSE("mouse"),
    PEN("pen"),
    TOUCH("touch");

    private final String value;

    PointerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static PointerType fromString(String text) {
        for (PointerType type : PointerType.values()) {
            if (type.value.equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No PointerType with value: " + text);
    }
}`;

    // Create Origin enum - explicitly defined because it's commonly used
    const originContent = `package org.openqa.selenium.bidirectional.input;

/**
 * Represents coordinate origin in WebDriver BiDi protocol
 */
public enum Origin {
    VIEWPORT("viewport"),
    POINTER("pointer"),
    ELEMENT("element");

    private final String value;

    Origin(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Origin fromString(String text) {
        for (Origin origin : Origin.values()) {
            if (origin.value.equalsIgnoreCase(text)) {
                return origin;
            }
        }
        throw new IllegalArgumentException("No Origin with value: " + text);
    }
}`;

    // Create directories and write files
    await fs.mkdirSync(path.join(outputDir, 'Input'), { recursive: true });
    await writeFile(path.resolve(outputDir, 'Input/PointerType.java'), pointerTypeContent);
    await writeFile(path.resolve(outputDir, 'Input/Origin.java'), originContent);

    // Generate Capabilities class to represent session capabilities
    const capabilitiesContent = `package org.openqa.selenium.bidirectional.session;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents browser capabilities in WebDriver BiDi protocol
 */
public class Capabilities {
    private final Map<String, Object> capabilities;

    public Capabilities(Map<String, Object> capabilities) {
        this.capabilities = capabilities != null ? capabilities : new HashMap<>();
    }

    public Boolean getAcceptInsecureCerts() {
        return (Boolean) capabilities.get("acceptInsecureCerts");
    }

    public String getBrowserName() {
        return (String) capabilities.get("browserName");
    }

    public String getBrowserVersion() {
        return (String) capabilities.get("browserVersion");
    }

    public String getPlatformName() {
        return (String) capabilities.get("platformName");
    }

    public Boolean getSetWindowRect() {
        return (Boolean) capabilities.get("setWindowRect");
    }

    public String getUserAgent() {
        return (String) capabilities.get("userAgent");
    }

    public String getWebSocketUrl() {
        return (String) capabilities.get("webSocketUrl");
    }

    public Map<String, Object> asMap() {
        return new HashMap<>(capabilities);
    }
}`;

    await fs.mkdirSync(path.join(outputDir, 'Session'), { recursive: true });
    await writeFile(path.resolve(outputDir, 'Session/Capabilities.java'), capabilitiesContent);
}

export async function transform (cddlFilePath: string, outputDir: string) {
    const ast = parseCDDLFile(cddlFilePath)
    const [moduleCode, propertyCode, resultCode] = await Promise.all([
        createModules(ast),
        createPropertyClasses(ast),
        createResultClasses(ast)
    ])

    await fs.mkdirSync(outputDir, { recursive: true })
    await Promise.all([
        createJavaFiles(moduleCode, outputDir),
        createJavaFiles(propertyCode, outputDir),
        createJavaFiles(resultCode, outputDir),
        createEmptyResultClass(outputDir),
        createHelperClasses(ast, outputDir)
    ])
}
