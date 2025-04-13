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
 * Represents parameters for browsingContext.BoxClipRectangle command
 */
public class BoxClipRectangle {

    /**
     * Creates a new BoxClipRectangle instance
     */
    public BoxClipRectangle(Float x, Float y, Float width, Float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = "box";
    }

    private final box type;

    /**
     * Gets the type property
     * @return box value
     */
    public box getType() {
        return this.type;
    }

    private final Float x;

    /**
     * Gets the x property
     * @return Float value
     */
    public Float getX() {
        return this.x;
    }

    private final Float y;

    /**
     * Gets the y property
     * @return Float value
     */
    public Float getY() {
        return this.y;
    }

    private final Float width;

    /**
     * Gets the width property
     * @return Float value
     */
    public Float getWidth() {
        return this.width;
    }

    private final Float height;

    /**
     * Gets the height property
     * @return Float value
     */
    public Float getHeight() {
        return this.height;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("x", this.x);
        toReturn.put("y", this.y);
        toReturn.put("width", this.width);
        toReturn.put("height", this.height);
        return toReturn;
    }

}