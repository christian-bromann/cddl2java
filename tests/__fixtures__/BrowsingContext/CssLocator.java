/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.browsingcontext;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for browsingContext.CssLocator command
 */
public class CssLocator {

    /**
     * Creates a new CssLocator instance
     */
    public CssLocator(String value) {
        this.value = value;
        this.type = "css";
    }

    private final css type;

    /**
     * Gets the type property
     * @return css value
     */
    public css getType() {
        return this.type;
    }

    private final String value;

    /**
     * Gets the value property
     * @return String value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("value", this.value);
        return toReturn;
    }

}