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
 * Represents parameters for network.AuthCredentials command
 */
public class AuthCredentials {

    /**
     * Creates a new AuthCredentials instance
     */
    public AuthCredentials(String username, String password) {
        this.username = username;
        this.password = password;
        this.type = "password";
    }

    private final password type;

    /**
     * Gets the type property
     * @return password value
     */
    public password getType() {
        return this.type;
    }

    private final String username;

    /**
     * Gets the username property
     * @return String value
     */
    public String getUsername() {
        return this.username;
    }

    private final String password;

    /**
     * Gets the password property
     * @return String value
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("username", this.username);
        toReturn.put("password", this.password);
        return toReturn;
    }

}