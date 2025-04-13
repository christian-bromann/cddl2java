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
 * Represents parameters for network.ResponseCompletedParameters command
 */
public class ResponseCompletedParameters {

    /**
     * Creates a new ResponseCompletedParameters instance
     */
    public ResponseCompletedParameters(Network.ResponseData response) {
        this.response = response;
    }

    private final Network.ResponseData response;

    /**
     * Gets the response property
     * @return Network.ResponseData value
     */
    public Network.ResponseData getResponse() {
        return this.response;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("response", this.response);
        return toReturn;
    }

}