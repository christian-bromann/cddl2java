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
 * Represents parameters for session.UnsubscribeByAttributesRequest command
 */
public class UnsubscribeByAttributesRequest {

    /**
     * Creates a new UnsubscribeByAttributesRequest instance
     */
    public UnsubscribeByAttributesRequest(List<Object> events, List<Object> contexts) {
        this.events = events;
        this.contexts = contexts;
        
    }

    private final List<Object> events;

    /**
     * Gets the events property
     * @return List<Object> value
     */
    public List<Object> getEvents() {
        return this.events;
    }

    private final List<Object> contexts;

    /**
     * Gets the contexts property
     * @return List<Object> value
     */
    public List<Object> getContexts() {
        return this.contexts;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("events", this.events);
        toReturn.put("contexts", this.contexts);
        return toReturn;
    }

}