/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.input;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for input.KeySourceActions command
 */
public class KeySourceActions implements SourceActions {

    /**
     * Creates a new KeySourceActions instance
     */
    public KeySourceActions(String id, List<Input.KeySourceAction> actions) {
        this.id = id;
        this.actions = actions;
        this.type = "key";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final String id;

    /**
     * Gets the id property
     * @return String value
     */
    public String getId() {
        return this.id;
    }

    private final List<Input.KeySourceAction> actions;

    /**
     * Gets the actions property
     * @return List<Input.KeySourceAction> value
     */
    public List<Input.KeySourceAction> getActions() {
        return this.actions;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("id", this.id);
        toReturn.put("actions", this.actions);
        return toReturn;
    }

}