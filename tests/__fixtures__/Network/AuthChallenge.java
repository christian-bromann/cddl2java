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
 * Represents parameters for network.AuthChallenge command
 */
public class AuthChallenge {

    /**
     * Creates a new AuthChallenge instance
     */
    public AuthChallenge(String scheme, String realm) {
        this.scheme = scheme;
        this.realm = realm;
    }

    private final String scheme;

    /**
     * Gets the scheme property
     * @return String value
     */
    public String getScheme() {
        return this.scheme;
    }

    private final String realm;

    /**
     * Gets the realm property
     * @return String value
     */
    public String getRealm() {
        return this.realm;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("scheme", this.scheme);
        toReturn.put("realm", this.realm);
        return toReturn;
    }

}