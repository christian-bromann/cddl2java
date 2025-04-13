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
 * Represents parameters for browsingContext.GetTreeResult command
 */
public class GetTreeResult {

    /**
     * Creates a new GetTreeResult instance
     */
    public GetTreeResult(BrowsingContext.InfoList contexts) {
        this.contexts = contexts;
    }

    private final BrowsingContext.InfoList contexts;

    /**
     * Gets the contexts property
     * @return BrowsingContext.InfoList value
     */
    public BrowsingContext.InfoList getContexts() {
        return this.contexts;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("contexts", this.contexts);
        return toReturn;
    }

}