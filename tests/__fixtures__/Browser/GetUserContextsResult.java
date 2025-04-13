/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.browser;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for browser.GetUserContextsResult command
 */
public class GetUserContextsResult {

    /**
     * Creates a new GetUserContextsResult instance
     */
    public GetUserContextsResult(List<Browser.UserContextInfo> userContexts) {
        this.userContexts = userContexts;
    }

    private final List<Browser.UserContextInfo> userContexts;

    /**
     * Gets the userContexts property
     * @return List<Browser.UserContextInfo> value
     */
    public List<Browser.UserContextInfo> getUserContexts() {
        return this.userContexts;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("userContexts", this.userContexts);
        return toReturn;
    }

}