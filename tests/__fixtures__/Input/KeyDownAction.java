/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.input;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for input.KeyDownAction command
 */
public class KeyDownAction {

    /**
     * Creates a new KeyDownAction instance
     */
    public KeyDownAction(String value) {
        this.value = value;
        this.type = "keyDown";
    }

    private final keyDown type;

    /**
     * Gets the type property
     * @return keyDown value
     */
    public keyDown getType() {
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