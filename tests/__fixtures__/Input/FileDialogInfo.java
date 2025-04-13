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
 * Represents parameters for input.FileDialogInfo command
 */
public class FileDialogInfo {

    /**
     * Creates a new FileDialogInfo instance
     */
    public FileDialogInfo(String context, Script.SharedReference element, Boolean multiple) {
        this.context = context;
        this.element = element;
        this.multiple = multiple;
    }

    private final String context;

    /**
     * Gets the context property
     * @return String value
     */
    public String getContext() {
        return this.context;
    }

    private final Script.SharedReference element;

    /**
     * Gets the element property
     * @return Script.SharedReference value
     */
    public Script.SharedReference getElement() {
        return this.element;
    }

    private final Boolean multiple;

    /**
     * Gets the multiple property
     * @return Boolean value
     */
    public Boolean getMultiple() {
        return this.multiple;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("context", this.context);
        toReturn.put("element", this.element);
        toReturn.put("multiple", this.multiple);
        return toReturn;
    }

}