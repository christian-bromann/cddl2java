package org.openqa.selenium.bidirectional.Script;


public class NodeRemoteValue {

    public NodeRemoteValue(Script.SharedId sharedId, Script.Handle handle, Script.InternalId internalId, Script.NodeProperties value) {
        this.sharedId = Script.SharedId;
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.value = Script.NodeProperties;
        this.type = "node";
    }

    private final node type;
    public getType(node type) {
        this.type = type;
    }

    private final Script.SharedId sharedId;
    public getSharedId(Script.SharedId sharedId) {
        this.sharedId = sharedId;
    }

    private final Script.Handle handle;
    public getHandle(Script.Handle handle) {
        this.handle = handle;
    }

    private final Script.InternalId internalId;
    public getInternalId(Script.InternalId internalId) {
        this.internalId = internalId;
    }

    private final Script.NodeProperties value;
    public getValue(Script.NodeProperties value) {
        this.value = value;
    }

}