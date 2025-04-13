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
 * Represents parameters for script.RegExpValue command
 */
public class RegExpValue {

    /**
     * Creates a new RegExpValue instance
     */
    public RegExpValue(String pattern, String flags) {
        this.pattern = pattern;
        this.flags = flags;
    }

    private final String pattern;

    /**
     * Gets the pattern property
     * @return String value
     */
    public String getPattern() {
        return this.pattern;
    }

    private final String flags;

    /**
     * Gets the flags property
     * @return String value
     */
    public String getFlags() {
        return this.flags;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("pattern", this.pattern);
        toReturn.put("flags", this.flags);
        return toReturn;
    }

}