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
 * Represents parameters for network.ContinueRequestParameters command
 */
public class ContinueRequestParameters {

    /**
     * Creates a new ContinueRequestParameters instance
     */
    public ContinueRequestParameters(String request, Network.BytesValue body, List<Network.CookieHeader> cookies, List<Network.Header> headers, String method, String url) {
        this.request = request;
        this.body = body;
        this.cookies = cookies;
        this.headers = headers;
        this.method = method;
        this.url = url;
    }

    private final String request;

    /**
     * Gets the request property
     * @return String value
     */
    public String getRequest() {
        return this.request;
    }

    private final Network.BytesValue body;

    /**
     * Gets the body property
     * @return Network.BytesValue value
     */
    public Network.BytesValue getBody() {
        return this.body;
    }

    private final List<Network.CookieHeader> cookies;

    /**
     * Gets the cookies property
     * @return List<Network.CookieHeader> value
     */
    public List<Network.CookieHeader> getCookies() {
        return this.cookies;
    }

    private final List<Network.Header> headers;

    /**
     * Gets the headers property
     * @return List<Network.Header> value
     */
    public List<Network.Header> getHeaders() {
        return this.headers;
    }

    private final String method;

    /**
     * Gets the method property
     * @return String value
     */
    public String getMethod() {
        return this.method;
    }

    private final String url;

    /**
     * Gets the url property
     * @return String value
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("request", this.request);
        toReturn.put("body", this.body);
        toReturn.put("cookies", this.cookies);
        toReturn.put("headers", this.headers);
        toReturn.put("method", this.method);
        toReturn.put("url", this.url);
        return toReturn;
    }

}