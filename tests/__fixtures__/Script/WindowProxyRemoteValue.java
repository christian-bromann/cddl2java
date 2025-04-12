package org.openqa.selenium.bidirectional.Script;


public class WindowProxyRemoteValue {

    public WindowProxyRemoteValue(Script.WindowProxyProperties value, Script.Handle handle, Script.InternalId internalId) {
        this.value = Script.WindowProxyProperties;
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.type = "window";
    }

    private final window type;
    public getType(window type) {
        this.type = type;
    }

    private final Script.WindowProxyProperties value;
    public getValue(Script.WindowProxyProperties value) {
        this.value = value;
    }

    private final Script.Handle handle;
    public getHandle(Script.Handle handle) {
        this.handle = handle;
    }

    private final Script.InternalId internalId;
    public getInternalId(Script.InternalId internalId) {
        this.internalId = internalId;
    }

}