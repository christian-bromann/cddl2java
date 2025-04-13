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
 * Represents parameters for script.ChannelProperties command
 */
public class ChannelProperties {

    /**
     * Creates a new ChannelProperties instance
     */
    public ChannelProperties(Script.Channel channel, Script.SerializationOptions serializationOptions, Script.ResultOwnership ownership) {
        this.channel = channel;
        this.serializationOptions = serializationOptions;
        this.ownership = ownership;
    }

    private final Script.Channel channel;

    /**
     * Gets the channel property
     * @return Script.Channel value
     */
    public Script.Channel getChannel() {
        return this.channel;
    }

    private final Script.SerializationOptions serializationOptions;

    /**
     * Gets the serializationOptions property
     * @return Script.SerializationOptions value
     */
    public Script.SerializationOptions getSerializationOptions() {
        return this.serializationOptions;
    }

    private final Script.ResultOwnership ownership;

    /**
     * Gets the ownership property
     * @return Script.ResultOwnership value
     */
    public Script.ResultOwnership getOwnership() {
        return this.ownership;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("channel", this.channel);
        toReturn.put("serializationOptions", this.serializationOptions);
        toReturn.put("ownership", this.ownership);
        return toReturn;
    }

}