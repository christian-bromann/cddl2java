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
 * Represents parameters for browsingContext.AccessibilityLocator command
 */
public class AccessibilityLocator {

    /**
     * Creates a new AccessibilityLocator instance
     */
    public AccessibilityLocator(Unknown value) {
        this.value = value;
        this.type = "accessibility";
    }

    private final accessibility type;

    /**
     * Gets the type property
     * @return accessibility value
     */
    public accessibility getType() {
        return this.type;
    }

    private final Unknown value;

    /**
     * Gets the value property
     * @return Unknown value
     */
    public Unknown getValue() {
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