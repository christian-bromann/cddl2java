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
 * Represents parameters for script.ObjectLocalValue command
 */
public class ObjectLocalValue {

    /**
     * Creates a new ObjectLocalValue instance
     */
    public ObjectLocalValue(Script.MappingLocalValue value) {
        this.value = value;
        this.type = "object";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final Script.MappingLocalValue value;

    /**
     * Gets the value property
     * @return Script.MappingLocalValue value
     */
    public Script.MappingLocalValue getValue() {
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