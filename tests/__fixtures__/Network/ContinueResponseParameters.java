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
 * Represents parameters for network.ContinueResponseParameters command
 */
public class ContinueResponseParameters {

    /**
     * Creates a new ContinueResponseParameters instance
     */
    public ContinueResponseParameters(Network.Request request, List<Object> cookies, Network.AuthCredentials credentials, List<Object> headers, String reasonPhrase, Long statusCode) {
        this.request = request;
        this.cookies = cookies;
        this.credentials = credentials;
        this.headers = headers;
        this.reasonPhrase = reasonPhrase;
        this.statusCode = statusCode;
        
    }

    private final Network.Request request;

    /**
     * Gets the request property
     * @return Network.Request value
     */
    public Network.Request getRequest() {
        return this.request;
    }

    private final List<Object> cookies;

    /**
     * Gets the cookies property
     * @return List<Object> value
     */
    public List<Object> getCookies() {
        return this.cookies;
    }

    private final Network.AuthCredentials credentials;

    /**
     * Gets the credentials property
     * @return Network.AuthCredentials value
     */
    public Network.AuthCredentials getCredentials() {
        return this.credentials;
    }

    private final List<Object> headers;

    /**
     * Gets the headers property
     * @return List<Object> value
     */
    public List<Object> getHeaders() {
        return this.headers;
    }

    private final String reasonPhrase;

    /**
     * Gets the reasonPhrase property
     * @return String value
     */
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    private final Long statusCode;

    /**
     * Gets the statusCode property
     * @return Long value
     */
    public Long getStatusCode() {
        return this.statusCode;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("request", this.request);
        toReturn.put("cookies", this.cookies);
        toReturn.put("credentials", this.credentials);
        toReturn.put("headers", this.headers);
        toReturn.put("reasonPhrase", this.reasonPhrase);
        toReturn.put("statusCode", this.statusCode);
        return toReturn;
    }

}