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
 * Represents parameters for script.WeakSetRemoteValue command
 */
public class WeakSetRemoteValue implements RemoteValue {

    /**
     * Creates a new WeakSetRemoteValue instance
     */
    public WeakSetRemoteValue(String handle, String internalId) {
        this.handle = handle;
        this.internalId = internalId;
        this.type = "weakset";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final String handle;

    /**
     * Gets the handle property
     * @return String value
     */
    public String getHandle() {
        return this.handle;
    }

    private final String internalId;

    /**
     * Gets the internalId property
     * @return String value
     */
    public String getInternalId() {
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