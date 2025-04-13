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
 * Represents parameters for log.ConsoleLogEntry command
 */
public class ConsoleLogEntry {

    /**
     * Creates a new ConsoleLogEntry instance
     */
    public ConsoleLogEntry(String method, List<Unknown> args) {
        this.method = method;
        this.args = args;
        this.type = "console";
    }

    private final console type;

    /**
     * Gets the type property
     * @return console value
     */
    public console getType() {
        return this.type;
    }

    private final String method;

    /**
     * Gets the method property
     * @return String value
     */
    public String getMethod() {
        return this.method;
    }

    private final List<Unknown> args;

    /**
     * Gets the args property
     * @return List<Unknown> value
     */
    public List<Unknown> getArgs() {
        return this.args;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("method", this.method);
        toReturn.put("args", this.args);
        return toReturn;
    }

}