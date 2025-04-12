package org.openqa.selenium.bidirectional.Script;


public class ErrorRemoteValue {

    public ErrorRemoteValue(Script.Handle handle, Script.InternalId internalId) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.type = "error";
    }

    private final error type;
    public getType(error type) {
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