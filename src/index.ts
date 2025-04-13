import fs from 'node:fs'
import path from 'node:path'
import util from 'node:util'

import camelcase from 'camelcase'
import { parse as parseCDDL, type PropertyReference, type Property, type Group, type Array, type Assignment, type PropertyType } from 'cddl'

import { writeFile } from './utils.js'
import { CDDL_PARSE_ERROR_MESSAGE } from './constants.js'
import {
    emptyResultTemplate,
    contextValueTemplate,
    accessibilityValueTemplate,
    pointerTypeTemplate,
    originTemplate,
    capabilitiesTemplate,
    newResultTemplate,
    capabilitiesClassTemplate
} from './templates.js'

type Scope = string
type FileName = string
type MapKey = [Scope, FileName]

function parseCDDLFile (filePath: string) {
    let ast

    try {
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

                let { type, isLiteral } = parseType(property.Type)

                // Override specific unknown types with known implementations
                let finalType = type;

                // Check for array of types
                // {
                //     "HasCut": true,
                //     "Occurrence": {
                //       "n": 0,
                //       "m": null
                //     },
                //     "Name": "cookies",
                //     "Type": [
                //       {
                //         "Type": "array",
                //         "Name": "",
                //         "Values": [
                //           {
                //             "HasCut": false,
                //             "Occurrence": {
                //               "n": 0,
                //               "m": null
                //             },
                //             "Name": "",
                //             "Type": [
                //               {
                //                 "Type": "group",
                //                 "Value": "network.SetCookieHeader",
                //                 "Unwrapped": false
                //               }
                //             ],
                //             "Comments": []
                //           }
                //         ],
                //         "Comments": []
                //       }
                //     ],
                //     "Comments": []
                //   }
                if (
                    Array.isArray(property.Type) &&
                    property.Type.length > 0 &&
                    property.Type[0] &&
                    (property.Type[0] as Array).Type === 'array'
                ) {
                    const prop = property.Type[0] as Array
                    if (prop.Values && prop.Values.length > 0 && prop.Values[0] && Array.isArray((prop.Values[0] as Property).Type)) {
                        const propType = (prop.Values[0] as Property).Type as PropertyReference[]
                        if (typeof propType[0].Value === 'string') {
                            finalType = `List<${parseType(propType[0]).type}>`
                        }
                    }
                }

                /**
                 * special cases for which we don't have proper type handling yet
                 */
                if (type === 'Unknown') {
                    console.log(11, JSON.stringify(property, null, 2))
                    // Apply special case overrides for common property names
                    if (property.Name === 'capabilities') {
                        finalType = 'Capabilities';
                    } else if (property.Name === 'value' &&
                              (assignment.Name.includes('Accessibility') || assignment.Name.includes('Element'))) {
                        finalType = 'AccessibilityValue';
                    } else if (property.Name === 'value' && assignment.Name.includes('Context')) {
                        finalType = 'ContextValue';
                    } else if (property.Name === 'attributes') {
                        finalType = 'Map<String, String>';
                    } else {
                        finalType = 'Object'; // Default fallback
                    }
                }

                props.set(property.Name, { type: finalType, isLiteral })
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
                const assignablePropsCode = assignableProps.length > 0
                    ? `
        ` + assignableProps.map(([prop]) => `this.${prop} = ${prop};`).join(`
        `)
                    : ''
                const literalPropsCode = literalProps.length > 0
                    ? `
        ` + literalProps.map(([prop, { type }]) => `this.${prop} = "${type}";`).join(`
        `)
                    : ''
                code += `
    /**
     * Creates a new ${propClassName} instance
     */
    public ${propClassName}(${assignableProps.map(([prop, { type }]) => `${type} ${prop}`).join(', ')}) {${
        assignablePropsCode + literalPropsCode}
    }
`
                // Add properties and getters
                for (const [prop, { type, isLiteral }] of props.entries()) {
                    const propNameCamelCase = prop[0].toUpperCase() + prop.slice(1)
                    // Use String type for literals
                    const javaType = isLiteral ? 'String' : type
                    code += `
    private final ${javaType} ${prop};

    /**
     * Gets the ${prop} property
     * @return ${javaType} value
     */
    public ${javaType} get${propNameCamelCase}() {
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

    // Handle common property patterns
    if (typeof specType === 'object' && !Array.isArray(specType) && 'Name' in specType) {
        const propName = specType.Name;

        // Handle specific property names
        if (propName === 'capabilities' && 'Type' in specType && Array.isArray(specType.Type)) {
            return { type: 'Capabilities', isLiteral: false };
        }

        // Handle attributes
        if (propName === 'attributes') {
            return { type: 'Map<String, String>', isLiteral: false };
        }

        // Handle value property with context
        if (propName === 'value' && 'Type' in specType && Array.isArray(specType.Type) &&
            specType.Type.length > 0 && typeof specType.Type[0] === 'object' &&
            specType.Type[0].Type === 'group' && 'Properties' in specType.Type[0]) {

            const properties = specType.Type[0].Properties;
            if (Array.isArray(properties)) {
                // Check property names to determine specific type
                const hasNameProp = properties.some((p: any) => !Array.isArray(p) && p.Name === 'name');
                const hasRoleProp = properties.some((p: any) => !Array.isArray(p) && p.Name === 'role');
                const hasContextProp = properties.some((p: any) => !Array.isArray(p) && p.Name === 'context');

                if (hasContextProp) {
                    return { type: 'ContextValue', isLiteral: false };
                }

                if (hasNameProp || hasRoleProp) {
                    return { type: 'AccessibilityValue', isLiteral: false };
                }
            }

            // Default for value objects
            return { type: 'Map<String, Object>', isLiteral: false };
        }
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
        // Handle primitive types
        if (specType[0] === 'bool') {
            return { type: 'Boolean', isLiteral: false };
        } else if (specType[0] === 'int') {
            return { type: 'Integer', isLiteral: false };
        } else if (specType[0] === 'float') {
            return { type: 'Float', isLiteral: false };
        } else if ((specType[0] === 'string' || specType[0] === 'text')) {
            return { type: 'String', isLiteral: false };
        } else if (specType[0] === 'null' || specType[0] === 'any') {
            return { type: 'Object', isLiteral: false };  // null/any represented as Object in Java
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
                            return { type: 'Map<String, String>', isLiteral: false };
                        }
                        return { type: 'Map<String, Object>', isLiteral: false };
                    } else if ('Value' in specType[0] && typeof specType[0].Value === 'string') {
                        // Special types
                        const value = specType[0].Value;

                        // Numeric types
                        if (value === 'js-int') {
                            return { type: 'Integer', isLiteral: false };
                        } else if (value === 'js-uint') {
                            return { type: 'Long', isLiteral: false };
                        } else if (value === 'Extensible') {
                            return { type: 'Map<String, Object>', isLiteral: false };
                        }

                        // Special case known types
                        const knownTypes: Record<string, string> = {
                            'session.Capabilities': 'Capabilities',
                            'Capabilities': 'Capabilities',
                            'session.Subscription': 'String',
                            'browsingContext.BrowsingContext': 'String',
                            'browser.UserContext': 'String',
                            'browser.ClientWindow': 'String'
                        };

                        if (value in knownTypes) {
                            return { type: knownTypes[value], isLiteral: false };
                        }

                        // Events are strings
                        if (value.endsWith('Event')) {
                            return { type: 'String', isLiteral: false };
                        }

                        // Reference to another type - keep proper casing
                        const parts = value.split('.');
                        if (parts.length > 1) {
                            // Handle scoped types (e.g., 'session.Subscription')
                            const scope = parts[0][0].toUpperCase() + parts[0].slice(1);
                            const typeName = parts[1][0].toUpperCase() + parts[1].slice(1);
                            return { type: `${scope}.${typeName}`, isLiteral: false };
                        }

                        // Simple type
                        return { type: value[0].toUpperCase() + value.slice(1), isLiteral: false };
                    }
                } else if (objType === 'float') {
                    return { type: 'Float', isLiteral: false };
                } else if (objType === 'range') {
                    // For range types, determine integer vs float
                    if (specType[0].Value && typeof specType[0].Value === 'object' &&
                        specType[0].Value.Min && specType[0].Value.Min.Value !== undefined) {
                        const minVal = specType[0].Value.Min.Value;
                        return { type: Number.isInteger(minVal) ? 'Integer' : 'Float', isLiteral: false };
                    }
                    return { type: 'Float', isLiteral: false }; // Default for ranges
                } else if (objType === 'literal' && 'Value' in specType[0] && specType[0].Value !== undefined) {
                    isLiteral = true;
                    type = typeof specType[0].Value === 'string' ?
                           specType[0].Value :
                           String(specType[0].Value);
                    return { type, isLiteral };
                } else if (objType === 'array' && 'Values' in specType[0]) {
                    // Handle array types
                    const valueType = parseType(specType[0].Values).type;

                    // Special handling for arrays of strings
                    if (valueType === 'Unknown' && Array.isArray(specType[0].Values) && specType[0].Values.length > 0) {
                        const firstValue = specType[0].Values[0];
                        if (typeof firstValue === 'object' && firstValue.Type === 'group' && 'Value' in firstValue) {
                            const referencedType = firstValue.Value;
                            if (typeof referencedType === 'string') {
                                if (referencedType === 'session.Subscription' ||
                                    referencedType === 'browsingContext.BrowsingContext' ||
                                    referencedType === 'browser.UserContext' ||
                                    referencedType.endsWith('Event')) {
                                    return { type: 'List<String>', isLiteral: false };
                                }
                            }
                        }
                        return { type: 'List<Object>', isLiteral: false };
                    }

                    return { type: valueType === 'Unknown' ? 'List<Object>' : `List<${valueType}>`, isLiteral: false };
                } else if (objType === 'map') {
                    return { type: 'Map<String, Object>', isLiteral: false };
                }
            }

            // Handle type with operator (default values)
            if ('Operator' in specType[0] && specType[0].Operator) {
                // Handle boolean with default
                if (specType[0].Type === 'bool') {
                    return { type: 'Boolean', isLiteral: false };
                }

                // Handle complex types with operators
                if (typeof specType[0].Type === 'object' && 'Type' in specType[0].Type) {
                    if (specType[0].Type.Type === 'range') {
                        return { type: 'Float', isLiteral: false };
                    } else if (specType[0].Type.Type === 'group' && 'Value' in specType[0].Type) {
                        if (specType[0].Type.Value === 'js-uint') {
                            return { type: 'Long', isLiteral: false };
                        }

                        // For other group references
                        const parts = specType[0].Type.Value.split('.');
                        if (parts.length > 1) {
                            const scope = parts[0][0].toUpperCase() + parts[0].slice(1);
                            const typeName = parts[1][0].toUpperCase() + parts[1].slice(1);
                            return { type: `${scope}.${typeName}`, isLiteral: false };
                        }
                    }
                }

                // Generic fallback for types with operators
                const baseType = typeof specType[0].Type === 'string'
                    ? specType[0].Type === 'bool' ? 'Boolean' : 'Object'
                    : parseType([{ Type: specType[0].Type.Type, Value: specType[0].Type.Value }]).type;
                return { type: baseType, isLiteral };
            }
        }
    } else {
        // Multiple types represent a union - use Object for unions
        return { type: 'Object', isLiteral: false };
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
            javaResultFiles.set(mapKey, newResultTemplate);
            continue;
        }

        // Special case for Capabilities - skip and handle separately
        if (assignment.Name === 'Capabilities') {
            javaResultFiles.set(mapKey, capabilitiesClassTemplate);
            continue;
        }

        const props = new Map<string, { type: string, isLiteral: boolean }>()

        if ('Properties' in assignment && assignment.Properties) {
            for (const property of assignment.Properties) {
                if (Array.isArray(property) || !property.Name) {
                    continue
                }

                const { type, isLiteral } = parseType(property.Type)

                // Override specific unknown types with known implementations
                let finalType = type;
                if (type === 'Unknown') {
                    // Apply special case overrides for common property names
                    if (property.Name === 'capabilities') {
                        finalType = 'Capabilities';
                    } else if (property.Name === 'value' &&
                              (assignment.Name.includes('Accessibility') || assignment.Name.includes('Element'))) {
                        finalType = 'AccessibilityValue';
                    } else if (property.Name === 'value' && assignment.Name.includes('Context')) {
                        finalType = 'ContextValue';
                    } else if (property.Name === 'attributes') {
                        finalType = 'Map<String, String>';
                    } else {
                        finalType = 'Object'; // Default fallback
                    }
                }

                props.set(property.Name, { type: finalType, isLiteral })
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
    await fs.mkdirSync(path.join(outputDir), { recursive: true });
    await writeFile(path.resolve(outputDir, 'EmptyResult.java'), emptyResultTemplate);
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

    // Create directories and write files
    await fs.mkdirSync(path.join(outputDir, 'Input'), { recursive: true });
    await writeFile(path.resolve(outputDir, 'Input/PointerType.java'), pointerTypeTemplate);
    await writeFile(path.resolve(outputDir, 'Input/Origin.java'), originTemplate);
    await writeFile(path.resolve(outputDir, 'ContextValue.java'), contextValueTemplate);
    await writeFile(path.resolve(outputDir, 'AccessibilityValue.java'), accessibilityValueTemplate);

    // Generate Capabilities class
    await fs.mkdirSync(path.join(outputDir, 'Session'), { recursive: true });
    await writeFile(path.resolve(outputDir, 'Session/Capabilities.java'), capabilitiesTemplate);
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
