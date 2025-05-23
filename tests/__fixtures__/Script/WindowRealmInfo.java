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
 * Represents parameters for script.WindowRealmInfo command
 */
public class WindowRealmInfo implements RealmInfo {

    /**
     * Creates a new WindowRealmInfo instance
     */
    public WindowRealmInfo(String context, String sandbox) {
        this.context = context;
        this.sandbox = sandbox;
        this.type = "window";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final String context;

    /**
     * Gets the context property
     * @return String value
     */
    public String getContext() {
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
        toReturn.put("type", this.type);
        toReturn.put("context", this.context);
        toReturn.put("sandbox", this.sandbox);
        return toReturn;
    }

}