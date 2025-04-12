package org.openqa.selenium.bidirectional.Script;


public class RemoteObjectReference {

    public RemoteObjectReference(Script.Handle handle, Script.SharedId sharedId) {
        this.handle = Script.Handle;
        this.sharedId = Script.SharedId;
        
    }

    private final Script.Handle handle;
    public getHandle(Script.Handle handle) {
        this.handle = handle;
    }

    private final Script.SharedId sharedId;
    public getSharedId(Script.SharedId sharedId) {
        this.sharedId = sharedId;
    }

}