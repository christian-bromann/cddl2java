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
 * Represents parameters for browser.ClientWindowNamedState command
 */
public class ClientWindowNamedState {

    /**
     * Creates a new ClientWindowNamedState instance
     */
    public ClientWindowNamedState(Object state) {
        this.state = state;
        
    }

    private final Object state;

    /**
     * Gets the state property
     * @return Object value
     */
    public Object getState() {
        return this.state;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("state", this.state);
        return toReturn;
    }

}