/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.script;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for script.CallFunctionParameters command
 */
public class CallFunctionParameters {

    /**
     * Creates a new CallFunctionParameters instance
     */
    public CallFunctionParameters(String functionDeclaration, Boolean awaitPromise, Script.Target target, List<Object> arguments, Script.ResultOwnership resultOwnership, Script.SerializationOptions serializationOptions, Script.LocalValue this, Boolean userActivation) {
        this.functionDeclaration = functionDeclaration;
        this.awaitPromise = awaitPromise;
        this.target = target;
        this.arguments = arguments;
        this.resultOwnership = resultOwnership;
        this.serializationOptions = serializationOptions;
        this.this = this;
        this.userActivation = userActivation;
        
    }

    private final String functionDeclaration;

    /**
     * Gets the functionDeclaration property
     * @return String value
     */
    public String getFunctionDeclaration() {
        return this.functionDeclaration;
    }

    private final Boolean awaitPromise;

    /**
     * Gets the awaitPromise property
     * @return Boolean value
     */
    public Boolean getAwaitPromise() {
        return this.awaitPromise;
    }

    private final Script.Target target;

    /**
     * Gets the target property
     * @return Script.Target value
     */
    public Script.Target getTarget() {
        return this.target;
    }

    private final List<Object> arguments;

    /**
     * Gets the arguments property
     * @return List<Object> value
     */
    public List<Object> getArguments() {
        return this.arguments;
    }

    private final Script.ResultOwnership resultOwnership;

    /**
     * Gets the resultOwnership property
     * @return Script.ResultOwnership value
     */
    public Script.ResultOwnership getResultOwnership() {
        return this.resultOwnership;
    }

    private final Script.SerializationOptions serializationOptions;

    /**
     * Gets the serializationOptions property
     * @return Script.SerializationOptions value
     */
    public Script.SerializationOptions getSerializationOptions() {
        return this.serializationOptions;
    }

    private final Script.LocalValue this;

    /**
     * Gets the this property
     * @return Script.LocalValue value
     */
    public Script.LocalValue getThis() {
        return this.this;
    }

    private final Boolean userActivation;

    /**
     * Gets the userActivation property
     * @return Boolean value
     */
    public Boolean getUserActivation() {
        return this.userActivation;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("functionDeclaration", this.functionDeclaration);
        toReturn.put("awaitPromise", this.awaitPromise);
        toReturn.put("target", this.target);
        toReturn.put("arguments", this.arguments);
        toReturn.put("resultOwnership", this.resultOwnership);
        toReturn.put("serializationOptions", this.serializationOptions);
        toReturn.put("this", this.this);
        toReturn.put("userActivation", this.userActivation);
        return toReturn;
    }

}