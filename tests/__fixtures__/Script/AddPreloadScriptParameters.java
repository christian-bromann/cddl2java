package org.openqa.selenium.bidirectional.Script;


public class AddPreloadScriptParameters {

    public AddPreloadScriptParameters(String functionDeclaration, String sandbox) {
        this.functionDeclaration = String;
        this.sandbox = String;
        this.arguments = "Unknown[]";
        this.contexts = "Unknown[]";
        this.userContexts = "Unknown[]";
    }

    private final String functionDeclaration;
    public getFunctionDeclaration(String functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    private final Unknown[] arguments;
    public getArguments(Unknown[] arguments) {
        this.arguments = arguments;
    }

    private final Unknown[] contexts;
    public getContexts(Unknown[] contexts) {
        this.contexts = contexts;
    }

    private final Unknown[] userContexts;
    public getUserContexts(Unknown[] userContexts) {
        this.userContexts = userContexts;
    }

    private final String sandbox;
    public getSandbox(String sandbox) {
        this.sandbox = sandbox;
    }

}