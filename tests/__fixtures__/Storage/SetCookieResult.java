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
 * Represents parameters for storage.SetCookieResult command
 */
public class SetCookieResult {

    /**
     * Creates a new SetCookieResult instance
     */
    public SetCookieResult(Storage.PartitionKey partitionKey) {
        this.partitionKey = partitionKey;
    }

    private final Storage.PartitionKey partitionKey;

    /**
     * Gets the partitionKey property
     * @return Storage.PartitionKey value
     */
    public Storage.PartitionKey getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("partitionKey", this.partitionKey);
        return toReturn;
    }

}