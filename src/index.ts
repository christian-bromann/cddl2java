import fs from 'node:fs'
import url from 'node:url'
import path from 'node:path'
import util from 'node:util'

import camelcase from 'camelcase'
import { parse as parseCDDL, type PropertyReference, type Property, type Group, type Assignment } from 'cddl'

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
        const paramType = `remote.${camelcase(paramName, { pascalCase: true })}`
        const resultTypeJava = responseType ? camelcase(responseType.Name, { pascalCase: true }) : 'EmptyResult'

        const paramKey = 'params'
        const specUrl = `https://w3c.github.io/webdriver-bidi/#command-${methodId.replace('.', '-')}`
        const description = `WebDriver Bidi command to send command method "${methodId}" with parameters.`
        const c = [
            '*',
            ` * ${description}`,
            ` * @url ${specUrl}`,
            ` * @param ${paramKey} \`${paramType.split('.')[1]}\` {@link ${specUrl} | command parameter}`,
            // ` * @returns \`Promise<${resultType}>\``,
            ' *'
        ]
        const [scope, command] = assignment.Name.split('.')
        const moduleScope = (scope[0].toUpperCase() + scope.slice(1)) as string

        const mapKey: MapKey = [moduleScope, `${moduleScope}Module`]
        if (!javaFiles.has(mapKey)) {
            javaFiles.set(mapKey, `package org.openqa.selenium.bidirectional.${scope.toLowerCase()};

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class ${moduleScope}Module {
`)
        }

        let code = javaFiles.get(mapKey) as string
        const resultTypeJavaEmbed = responseType ? resultTypeJava.slice(scope.length) : 'EmptyResult'
        code += `
    /*${c.join('\n    ')}/
    public Command<${resultTypeJavaEmbed}> ${command} (${(paramName.slice(scope.length).split('.').join(''))} parameters) {
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
                    code += `package org.openqa.selenium.bidirectional.${scopeCamelCase};\n\n
public class ${propClassName} {\n`
                }

                const assignableProps = Array.from(props.entries()).filter(([_, { isLiteral }]) => !isLiteral)
                const literalProps = Array.from(props.entries()).filter(([_, { isLiteral }]) => isLiteral)
                code += `
    public ${propClassName}(${assignableProps.map(([prop, { type }]) => `${type} ${prop}`).join(', ')}) {
        ${assignableProps.map(([prop, { type }]) => `this.${prop} = ${type};`).join(`
        `)}
        ${literalProps.map(([prop, { type }]) => `this.${prop} = "${type}";`).join(`
        `)}
    }\n`
                for (const [prop, { type }] of props.entries()) {
                    const propNameCamelCase = prop[0].toUpperCase() + prop.slice(1)
                    code += `
    private final ${type} ${prop};
    public get${propNameCamelCase}(${type} ${prop}) {
        this.${prop} = ${prop};
    }\n`
                }

                javaPropFiles.set(mapKey, code)
            }
        }
    }

    return javaPropFiles
}

function parseType (specType: any) {
    let type = 'Unknown'
    let isLiteral = false

    if (!Array.isArray(specType) || specType.length !== 1) {
        return { type, isLiteral }
    }

    if (specType[0] === 'bool') {
        type = 'boolean'
    } else if (specType[0] === 'int') {
        type = 'int'
    } else if (specType[0] === 'float') {
        type = 'float'
    } else if ((specType[0] === 'string' || specType[0] === 'text')) {
        type = 'String'
    } else if (specType[0].Type === 'group' && specType[0].Value === 'js-int') {
        type = 'int'
    } else if (specType[0].Type === 'group' && specType[0].Value === 'js-uint') {
        type = 'long'
    } else if (specType[0].Type === 'group' && typeof specType[0].Value === 'string') {
        type = specType[0].Value[0].toUpperCase() + specType[0].Value.slice(1)
    } else if (specType[0].Type === 'float') {
        type = 'float'
    } else if (specType[0].Type === 'literal' && specType[0].Value) {
        isLiteral = true
        type = specType[0].Value
    } else if (specType[0].Type === 'array') {
        isLiteral = true
        type = `${parseType(specType[0].Values[0]).type}[]`
    }

    return { type, isLiteral }
}

async function createJavaFiles (javaFiles: Map<MapKey, string>, outputDir: string) {
    for (const [[moduleScope, moduleName], code] of javaFiles.entries()) {
        const rootDir = path.join(outputDir, moduleScope)

        await fs.mkdirSync(rootDir, { recursive: true })
        await fs.writeFileSync(path.resolve(rootDir, `${moduleName}.java`), code + '\n}')
    }
}

export async function transform (cddlFilePath: string, outputDir: string) {
    const ast = parseCDDLFile(cddlFilePath)
    const [moduleCode, propertyCode] = await Promise.all([
        createModules(ast),
        createPropertyClasses(ast)
    ])

    await fs.mkdirSync(outputDir, { recursive: true })
    await Promise.all([
        createJavaFiles(moduleCode, outputDir),
        createJavaFiles(propertyCode, outputDir)
    ])
}