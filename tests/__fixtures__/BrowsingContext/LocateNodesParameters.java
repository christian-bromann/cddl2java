/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.browsingcontext;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for browsingContext.LocateNodesParameters command
 */
public class LocateNodesParameters {

    /**
     * Creates a new LocateNodesParameters instance
     */
    public LocateNodesParameters(String context, BrowsingContext.Locator locator, Long maxNodeCount, Script.SerializationOptions serializationOptions, List<Script.SharedReference> startNodes) {
        this.context = context;
        this.locator = locator;
        this.maxNodeCount = maxNodeCount;
        this.serializationOptions = serializationOptions;
        this.startNodes = startNodes;
    }

    private final String context;

    /**
     * Gets the context property
     * @return String value
     */
    public String getContext() {
        return this.context;
    }

    private final BrowsingContext.Locator locator;

    /**
     * Gets the locator property
     * @return BrowsingContext.Locator value
     */
    public BrowsingContext.Locator getLocator() {
        return this.locator;
    }

    private final Long maxNodeCount;

    /**
     * Gets the maxNodeCount property
     * @return Long value
     */
    public Long getMaxNodeCount() {
        return this.maxNodeCount;
    }

    private final Script.SerializationOptions serializationOptions;

    /**
     * Gets the serializationOptions property
     * @return Script.SerializationOptions value
     */
    public Script.SerializationOptions getSerializationOptions() {
        return this.serializationOptions;
    }

    private final List<Script.SharedReference> startNodes;

    /**
     * Gets the startNodes property
     * @return List<Script.SharedReference> value
     */
    public List<Script.SharedReference> getStartNodes() {
        return this.startNodes;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("context", this.context);
        toReturn.put("locator", this.locator);
        toReturn.put("maxNodeCount", this.maxNodeCount);
        toReturn.put("serializationOptions", this.serializationOptions);
        toReturn.put("startNodes", this.startNodes);
        return toReturn;
    }

}