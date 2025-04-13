/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.log;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for log.JavascriptLogEntry command
 */
public class JavascriptLogEntry {

    /**
     * Creates a new JavascriptLogEntry instance
     */
    public JavascriptLogEntry() {
        
        this.type = "javascript";
    }

    private final javascript type;

    /**
     * Gets the type property
     * @return javascript value
     */
    public javascript getType() {
        return this.type;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        return toReturn;
    }

}