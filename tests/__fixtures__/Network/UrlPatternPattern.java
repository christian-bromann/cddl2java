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
 * Represents parameters for network.UrlPatternPattern command
 */
public class UrlPatternPattern {

    /**
     * Creates a new UrlPatternPattern instance
     */
    public UrlPatternPattern(String protocol, String hostname, String port, String pathname, String search) {
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathname = pathname;
        this.search = search;
        this.type = "pattern";
    }

    private final String type;

    /**
     * Gets the type property
     * @return String value
     */
    public String getType() {
        return this.type;
    }

    private final String protocol;

    /**
     * Gets the protocol property
     * @return String value
     */
    public String getProtocol() {
        return this.protocol;
    }

    private final String hostname;

    /**
     * Gets the hostname property
     * @return String value
     */
    public String getHostname() {
        return this.hostname;
    }

    private final String port;

    /**
     * Gets the port property
     * @return String value
     */
    public String getPort() {
        return this.port;
    }

    private final String pathname;

    /**
     * Gets the pathname property
     * @return String value
     */
    public String getPathname() {
        return this.pathname;
    }

    private final String search;

    /**
     * Gets the search property
     * @return String value
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("protocol", this.protocol);
        toReturn.put("hostname", this.hostname);
        toReturn.put("port", this.port);
        toReturn.put("pathname", this.pathname);
        toReturn.put("search", this.search);
        return toReturn;
    }

}