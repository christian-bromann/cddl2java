package org.openqa.selenium.bidirectional.Script;


public class HTMLCollectionRemoteValue {

    public HTMLCollectionRemoteValue(Script.Handle handle, Script.InternalId internalId, Script.ListRemoteValue value) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.value = Script.ListRemoteValue;
        this.type = "htmlcollection";
    }

    private final htmlcollection type;
    public getType(htmlcollection type) {
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

    private final Script.ListRemoteValue value;
    public getValue(Script.ListRemoteValue value) {
        this.value = value;
    }

}