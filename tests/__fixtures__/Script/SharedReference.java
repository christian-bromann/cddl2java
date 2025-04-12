package org.openqa.selenium.bidirectional.Script;


public class SharedReference {

    public SharedReference(Script.SharedId sharedId, Script.Handle handle) {
        this.sharedId = Script.SharedId;
        this.handle = Script.Handle;
        
    }

    private final Script.SharedId sharedId;
    public getSharedId(Script.SharedId sharedId) {
        this.sharedId = sharedId;
    }

    private final Script.Handle handle;
    public getHandle(Script.Handle handle) {
        this.handle = handle;
    }

}