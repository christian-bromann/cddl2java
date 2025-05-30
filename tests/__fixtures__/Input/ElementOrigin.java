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
 * Represents parameters for input.ElementOrigin command
 */
public class ElementOrigin {

    /**
     * Creates a new ElementOrigin instance
     */
    public ElementOrigin(Script.SharedReference element) {
        this.element = element;
        this.type = "element";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final Script.SharedReference element;

    /**
     * Gets the element property
     * @return Script.SharedReference value
     */
    public Script.SharedReference getElement() {
        return this.element;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("element", this.element);
        return toReturn;
    }

}