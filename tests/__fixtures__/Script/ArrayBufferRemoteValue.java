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
 * Represents parameters for script.ArrayBufferRemoteValue command
 */
public class ArrayBufferRemoteValue {

    /**
     * Creates a new ArrayBufferRemoteValue instance
     */
    public ArrayBufferRemoteValue(Script.Handle handle, Script.InternalId internalId) {
        this.handle = handle;
        this.internalId = internalId;
        this.type = "arraybuffer";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final Script.Handle handle;

    /**
     * Gets the handle property
     * @return Script.Handle value
     */
    public Script.Handle getHandle() {
        return this.handle;
    }

    private final Script.InternalId internalId;

    /**
     * Gets the internalId property
     * @return Script.InternalId value
     */
    public Script.InternalId getInternalId() {
        return this.internalId;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("handle", this.handle);
        toReturn.put("internalId", this.internalId);
        return toReturn;
    }

}