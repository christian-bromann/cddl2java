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
 * Represents parameters for script.ContextTarget command
 */
public class ContextTarget {

    /**
     * Creates a new ContextTarget instance
     */
    public ContextTarget(BrowsingContext.BrowsingContext context, String sandbox) {
        this.context = context;
        this.sandbox = sandbox;
        
    }

    private final BrowsingContext.BrowsingContext context;

    /**
     * Gets the context property
     * @return BrowsingContext.BrowsingContext value
     */
    public BrowsingContext.BrowsingContext getContext() {
        return this.context;
    }

    private final String sandbox;

    /**
     * Gets the sandbox property
     * @return String value
     */
    public String getSandbox() {
        return this.sandbox;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("context", this.context);
        toReturn.put("sandbox", this.sandbox);
        return toReturn;
    }

}