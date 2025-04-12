package org.openqa.selenium.bidirectional.Script;


public class ChannelValue {

    public ChannelValue(Script.ChannelProperties value) {
        this.value = Script.ChannelProperties;
        this.type = "channel";
    }

    private final channel type;
    public getType(channel type) {
        this.type = type;
    }

    private final Script.ChannelProperties value;
    public getValue(Script.ChannelProperties value) {
        this.value = value;
    }

}