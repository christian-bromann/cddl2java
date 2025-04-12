package org.openqa.selenium.bidirectional.Script;


public class MessageParameters {

    public MessageParameters(Script.Channel channel, Script.RemoteValue data, Script.Source source) {
        this.channel = Script.Channel;
        this.data = Script.RemoteValue;
        this.source = Script.Source;
        
    }

    private final Script.Channel channel;
    public getChannel(Script.Channel channel) {
        this.channel = channel;
    }

    private final Script.RemoteValue data;
    public getData(Script.RemoteValue data) {
        this.data = data;
    }

    private final Script.Source source;
    public getSource(Script.Source source) {
        this.source = source;
    }

}