/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.storage;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for storage.StorageKeyPartitionDescriptor command
 */
public class StorageKeyPartitionDescriptor implements PartitionDescriptor {

    /**
     * Creates a new StorageKeyPartitionDescriptor instance
     */
    public StorageKeyPartitionDescriptor(String userContext, String sourceOrigin) {
        this.userContext = userContext;
        this.sourceOrigin = sourceOrigin;
        this.type = "storageKey";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final String userContext;

    /**
     * Gets the userContext property
     * @return String value
     */
    public String getUserContext() {
        return this.userContext;
    }

    private final String sourceOrigin;

    /**
     * Gets the sourceOrigin property
     * @return String value
     */
    public String getSourceOrigin() {
        return this.sourceOrigin;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("userContext", this.userContext);
        toReturn.put("sourceOrigin", this.sourceOrigin);
        return toReturn;
    }

}