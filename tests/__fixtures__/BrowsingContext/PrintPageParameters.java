/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.browsingcontext;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for browsingContext.PrintPageParameters command
 */
public class PrintPageParameters {

    /**
     * Creates a new PrintPageParameters instance
     */
    public PrintPageParameters(Object height, Object width) {
        this.height = height;
        this.width = width;
        
    }

    private final Object height;

    /**
     * Gets the height property
     * @return Object value
     */
    public Object getHeight() {
        return this.height;
    }

    private final Object width;

    /**
     * Gets the width property
     * @return Object value
     */
    public Object getWidth() {
        return this.width;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("height", this.height);
        toReturn.put("width", this.width);
        return toReturn;
    }

}