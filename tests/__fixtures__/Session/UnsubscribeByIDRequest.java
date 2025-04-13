/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.session;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for session.UnsubscribeByIDRequest command
 */
public class UnsubscribeByIDRequest {

    /**
     * Creates a new UnsubscribeByIDRequest instance
     */
    public UnsubscribeByIDRequest(List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    private final List<String> subscriptions;

    /**
     * Gets the subscriptions property
     * @return List<String> value
     */
    public List<String> getSubscriptions() {
        return this.subscriptions;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("subscriptions", this.subscriptions);
        return toReturn;
    }

}