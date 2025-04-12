package org.openqa.selenium.bidirectional.Script;


public class PromiseRemoteValue {

    public PromiseRemoteValue(Script.Handle handle, Script.InternalId internalId) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.type = "promise";
    }

    private final promise type;
    public getType(promise type) {
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