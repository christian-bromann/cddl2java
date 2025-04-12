package org.openqa.selenium.bidirectional.Script;


public class CallFunctionParameters {

    public CallFunctionParameters(String functionDeclaration, boolean awaitPromise, Script.Target target, Script.ResultOwnership resultOwnership, Script.SerializationOptions serializationOptions, Script.LocalValue this, Unknown userActivation) {
        this.functionDeclaration = String;
        this.awaitPromise = boolean;
        this.target = Script.Target;
        this.resultOwnership = Script.ResultOwnership;
        this.serializationOptions = Script.SerializationOptions;
        this.this = Script.LocalValue;
        this.userActivation = Unknown;
        this.arguments = "Unknown[]";
    }

    private final String functionDeclaration;
    public getFunctionDeclaration(String functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    private final boolean awaitPromise;
    public getAwaitPromise(boolean awaitPromise) {
        this.awaitPromise = awaitPromise;
    }

    private final Script.Target target;
    public getTarget(Script.Target target) {
        this.target = target;
    }

    private final Unknown[] arguments;
    public getArguments(Unknown[] arguments) {
        this.arguments = arguments;
    }

    private final Script.ResultOwnership resultOwnership;
    public getResultOwnership(Script.ResultOwnership resultOwnership) {
        this.resultOwnership = resultOwnership;
    }

    private final Script.SerializationOptions serializationOptions;
    public getSerializationOptions(Script.SerializationOptions serializationOptions) {
        this.serializationOptions = serializationOptions;
    }

    private final Script.LocalValue this;
    public getThis(Script.LocalValue this) {
        this.this = this;
    }

    private final Unknown userActivation;
    public getUserActivation(Unknown userActivation) {
        this.userActivation = userActivation;
    }

}