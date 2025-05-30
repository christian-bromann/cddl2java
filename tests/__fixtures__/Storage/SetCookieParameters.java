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
 * Represents parameters for storage.SetCookieParameters command
 */
public class SetCookieParameters {

    /**
     * Creates a new SetCookieParameters instance
     */
    public SetCookieParameters(Storage.PartialCookie cookie, Storage.PartitionDescriptor partition) {
        this.cookie = cookie;
        this.partition = partition;
    }

    private final Storage.PartialCookie cookie;

    /**
     * Gets the cookie property
     * @return Storage.PartialCookie value
     */
    public Storage.PartialCookie getCookie() {
        return this.cookie;
    }

    private final Storage.PartitionDescriptor partition;

    /**
     * Gets the partition property
     * @return Storage.PartitionDescriptor value
     */
    public Storage.PartitionDescriptor getPartition() {
        return this.partition;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("cookie", this.cookie);
        toReturn.put("partition", this.partition);
        return toReturn;
    }

}