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
 * Represents parameters for network.UrlPatternString command
 */
public class UrlPatternString implements UrlPattern {

    /**
     * Creates a new UrlPatternString instance
     */
    public UrlPatternString(String pattern) {
        this.pattern = pattern;
        this.type = "string";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final String pattern;

    /**
     * Gets the pattern property
     * @return String value
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("pattern", this.pattern);
        return toReturn;
    }

}