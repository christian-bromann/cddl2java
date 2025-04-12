package org.openqa.selenium.bidirectional.Script;


public class ProxyRemoteValue {

    public ProxyRemoteValue(Script.Handle handle, Script.InternalId internalId) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.type = "proxy";
    }

    private final proxy type;
    public getType(proxy type) {
        this.type = type;
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