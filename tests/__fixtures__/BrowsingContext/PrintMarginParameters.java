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
 * Represents parameters for browsingContext.PrintMarginParameters command
 */
public class PrintMarginParameters {

    /**
     * Creates a new PrintMarginParameters instance
     */
    public PrintMarginParameters(Float bottom, Float left, Float right, Float top) {
        this.bottom = bottom;
        this.left = left;
        this.right = right;
        this.top = top;
    }

    private final Float bottom;

    /**
     * Gets the bottom property
     * @return Float value
     */
    public Float getBottom() {
        return this.bottom;
    }

    private final Float left;

    /**
     * Gets the left property
     * @return Float value
     */
    public Float getLeft() {
        return this.left;
    }

    private final Float right;

    /**
     * Gets the right property
     * @return Float value
     */
    public Float getRight() {
        return this.right;
    }

    private final Float top;

    /**
     * Gets the top property
     * @return Float value
     */
    public Float getTop() {
        return this.top;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("bottom", this.bottom);
        toReturn.put("left", this.left);
        toReturn.put("right", this.right);
        toReturn.put("top", this.top);
        return toReturn;
    }

}