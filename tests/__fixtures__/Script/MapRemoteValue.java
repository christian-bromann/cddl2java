package org.openqa.selenium.bidirectional.Script;


public class MapRemoteValue {

    public MapRemoteValue(Script.Handle handle, Script.InternalId internalId, Script.MappingRemoteValue value) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.value = Script.MappingRemoteValue;
        this.type = "map";
    }

    private final map type;
    public getType(map type) {
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

    private final Script.MappingRemoteValue value;
    public getValue(Script.MappingRemoteValue value) {
        this.value = value;
    }

}