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
 * Represents parameters for network.BeforeRequestSentParameters command
 */
public class BeforeRequestSentParameters {

    /**
     * Creates a new BeforeRequestSentParameters instance
     */
    public BeforeRequestSentParameters(Network.Initiator initiator) {
        this.initiator = initiator;
    }

    private final Network.Initiator initiator;

    /**
     * Gets the initiator property
     * @return Network.Initiator value
     */
    public Network.Initiator getInitiator() {
        return this.initiator;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("initiator", this.initiator);
        return toReturn;
    }

}