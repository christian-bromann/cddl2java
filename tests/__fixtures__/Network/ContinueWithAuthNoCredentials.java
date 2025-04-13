/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.network;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for network.ContinueWithAuthNoCredentials command
 */
public class ContinueWithAuthNoCredentials {

    /**
     * Creates a new ContinueWithAuthNoCredentials instance
     */
    public ContinueWithAuthNoCredentials(Object action) {
        this.action = action;
    }

    private final Object action;

    /**
     * Gets the action property
     * @return Object value
     */
    public Object getAction() {
        return this.action;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("action", this.action);
        return toReturn;
    }

}