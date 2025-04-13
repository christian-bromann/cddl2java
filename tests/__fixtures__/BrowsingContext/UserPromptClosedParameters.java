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
 * Represents parameters for browsingContext.UserPromptClosedParameters command
 */
public class UserPromptClosedParameters {

    /**
     * Creates a new UserPromptClosedParameters instance
     */
    public UserPromptClosedParameters(String context, Boolean accepted, BrowsingContext.UserPromptType type, String userText) {
        this.context = context;
        this.accepted = accepted;
        this.type = type;
        this.userText = userText;
        
    }

    private final String context;

    /**
     * Gets the context property
     * @return String value
     */
    public String getContext() {
        return this.context;
    }

    private final Boolean accepted;

    /**
     * Gets the accepted property
     * @return Boolean value
     */
    public Boolean getAccepted() {
        return this.accepted;
    }

    private final BrowsingContext.UserPromptType type;

    /**
     * Gets the type property
     * @return BrowsingContext.UserPromptType value
     */
    public BrowsingContext.UserPromptType getType() {
        return this.type;
    }

    private final String userText;

    /**
     * Gets the userText property
     * @return String value
     */
    public String getUserText() {
        return this.userText;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("context", this.context);
        toReturn.put("accepted", this.accepted);
        toReturn.put("type", this.type);
        toReturn.put("userText", this.userText);
        return toReturn;
    }

}