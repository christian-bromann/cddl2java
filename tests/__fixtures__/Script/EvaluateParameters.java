package org.openqa.selenium.bidirectional.Script;


public class EvaluateParameters {

    public EvaluateParameters(String expression, Script.Target target, boolean awaitPromise, Script.ResultOwnership resultOwnership, Script.SerializationOptions serializationOptions, Unknown userActivation) {
        this.expression = String;
        this.target = Script.Target;
        this.awaitPromise = boolean;
        this.resultOwnership = Script.ResultOwnership;
        this.serializationOptions = Script.SerializationOptions;
        this.userActivation = Unknown;
        
    }

    private final String expression;
    public getExpression(String expression) {
        this.expression = expression;
    }

    private final Script.Target target;
    public getTarget(Script.Target target) {
        this.target = target;
    }

    private final boolean awaitPromise;
    public getAwaitPromise(boolean awaitPromise) {
        this.awaitPromise = awaitPromise;
    }

    private final Script.ResultOwnership resultOwnership;
    public getResultOwnership(Script.ResultOwnership resultOwnership) {
        this.resultOwnership = resultOwnership;
    }

    private final Script.SerializationOptions serializationOptions;
    public getSerializationOptions(Script.SerializationOptions serializationOptions) {
        this.serializationOptions = serializationOptions;
    }

    private final Unknown userActivation;
    public getUserActivation(Unknown userActivation) {
        this.userActivation = userActivation;
    }

}