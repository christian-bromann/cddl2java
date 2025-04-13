/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.network;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for network.AddInterceptResult command
 */
public class AddInterceptResult {

    /**
     * Creates a new AddInterceptResult instance
     */
    public AddInterceptResult(Network.Intercept intercept) {
        this.intercept = intercept;
        
    }

    private final Network.Intercept intercept;

    /**
     * Gets the intercept property
     * @return Network.Intercept value
     */
    public Network.Intercept getIntercept() {
        return this.intercept;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("intercept", this.intercept);
        return toReturn;
    }

}