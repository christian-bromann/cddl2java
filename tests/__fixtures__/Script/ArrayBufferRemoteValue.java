package org.openqa.selenium.bidirectional.Script;


public class ArrayBufferRemoteValue {

    public ArrayBufferRemoteValue(Script.Handle handle, Script.InternalId internalId) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.type = "arraybuffer";
    }

    private final arraybuffer type;
    public getType(arraybuffer type) {
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