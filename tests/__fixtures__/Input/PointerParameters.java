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
 * Represents parameters for input.PointerParameters command
 */
public class PointerParameters {

    /**
     * Creates a new PointerParameters instance
     */
    public PointerParameters(Input.PointerType pointerType) {
        this.pointerType = pointerType;
        
    }

    private final Input.PointerType pointerType;

    /**
     * Gets the pointerType property
     * @return Input.PointerType value
     */
    public Input.PointerType getPointerType() {
        return this.pointerType;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("pointerType", this.pointerType);
        return toReturn;
    }

}