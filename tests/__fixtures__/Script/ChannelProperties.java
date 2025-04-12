package org.openqa.selenium.bidirectional.Script;


public class ChannelProperties {

    public ChannelProperties(Script.Channel channel, Script.SerializationOptions serializationOptions, Script.ResultOwnership ownership) {
        this.channel = Script.Channel;
        this.serializationOptions = Script.SerializationOptions;
        this.ownership = Script.ResultOwnership;
        
    }

    private final Script.Channel channel;
    public getChannel(Script.Channel channel) {
        this.channel = channel;
    }

    private final Script.SerializationOptions serializationOptions;
    public getSerializationOptions(Script.SerializationOptions serializationOptions) {
        this.serializationOptions = serializationOptions;
    }

    private final Script.ResultOwnership ownership;
    public getOwnership(Script.ResultOwnership ownership) {
        this.ownership = ownership;
    }

}