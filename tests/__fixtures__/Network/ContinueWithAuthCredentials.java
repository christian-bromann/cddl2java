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
 * Represents parameters for network.ContinueWithAuthCredentials command
 */
public class ContinueWithAuthCredentials {

    /**
     * Creates a new ContinueWithAuthCredentials instance
     */
    public ContinueWithAuthCredentials(Network.AuthCredentials credentials) {
        this.credentials = credentials;
        this.action = "provideCredentials";
    }

    private final provideCredentials action;

    /**
     * Gets the action property
     * @return provideCredentials value
     */
    public provideCredentials getAction() {
        return this.action;
    }

    private final Network.AuthCredentials credentials;

    /**
     * Gets the credentials property
     * @return Network.AuthCredentials value
     */
    public Network.AuthCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("action", this.action);
        toReturn.put("credentials", this.credentials);
        return toReturn;
    }

}