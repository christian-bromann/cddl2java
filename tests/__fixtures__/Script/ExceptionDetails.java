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
 * Represents parameters for script.ExceptionDetails command
 */
public class ExceptionDetails {

    /**
     * Creates a new ExceptionDetails instance
     */
    public ExceptionDetails(Long columnNumber, Script.RemoteValue exception, Long lineNumber, Script.StackTrace stackTrace, String text) {
        this.columnNumber = columnNumber;
        this.exception = exception;
        this.lineNumber = lineNumber;
        this.stackTrace = stackTrace;
        this.text = text;
    }

    private final Long columnNumber;

    /**
     * Gets the columnNumber property
     * @return Long value
     */
    public Long getColumnNumber() {
        return this.columnNumber;
    }

    private final Script.RemoteValue exception;

    /**
     * Gets the exception property
     * @return Script.RemoteValue value
     */
    public Script.RemoteValue getException() {
        return this.exception;
    }

    private final Long lineNumber;

    /**
     * Gets the lineNumber property
     * @return Long value
     */
    public Long getLineNumber() {
        return this.lineNumber;
    }

    private final Script.StackTrace stackTrace;

    /**
     * Gets the stackTrace property
     * @return Script.StackTrace value
     */
    public Script.StackTrace getStackTrace() {
        return this.stackTrace;
    }

    private final String text;

    /**
     * Gets the text property
     * @return String value
     */
    public String getText() {
        return this.text;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("columnNumber", this.columnNumber);
        toReturn.put("exception", this.exception);
        toReturn.put("lineNumber", this.lineNumber);
        toReturn.put("stackTrace", this.stackTrace);
        toReturn.put("text", this.text);
        return toReturn;
    }

}