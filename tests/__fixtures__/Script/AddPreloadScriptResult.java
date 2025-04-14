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
 * Represents parameters for script.AddPreloadScriptResult command
 */
public class AddPreloadScriptResult implements ScriptResult {

    /**
     * Creates a new AddPreloadScriptResult instance
     */
    public AddPreloadScriptResult(String script) {
        this.script = script;
    }

    private final String script;

    /**
     * Gets the script property
     * @return String value
     */
    public String getScript() {
        return this.script;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("script", this.script);
        return toReturn;
    }

}