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
 * Represents parameters for browser.GetClientWindowsResult command
 */
public class GetClientWindowsResult {

    /**
     * Creates a new GetClientWindowsResult instance
     */
    public GetClientWindowsResult(List<Object> clientWindows) {
        this.clientWindows = clientWindows;
        
    }

    private final List<Object> clientWindows;

    /**
     * Gets the clientWindows property
     * @return List<Object> value
     */
    public List<Object> getClientWindows() {
        return this.clientWindows;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("clientWindows", this.clientWindows);
        return toReturn;
    }

}