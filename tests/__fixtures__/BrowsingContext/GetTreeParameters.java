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
 * Represents parameters for browsingContext.GetTreeParameters command
 */
public class GetTreeParameters {

    /**
     * Creates a new GetTreeParameters instance
     */
    public GetTreeParameters(Long maxDepth, String root) {
        this.maxDepth = maxDepth;
        this.root = root;
    }

    private final Long maxDepth;

    /**
     * Gets the maxDepth property
     * @return Long value
     */
    public Long getMaxDepth() {
        return this.maxDepth;
    }

    private final String root;

    /**
     * Gets the root property
     * @return String value
     */
    public String getRoot() {
        return this.root;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("maxDepth", this.maxDepth);
        toReturn.put("root", this.root);
        return toReturn;
    }

}