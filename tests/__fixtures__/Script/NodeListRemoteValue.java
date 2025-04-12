/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.Script;


public class NodeListRemoteValue {

    public NodeListRemoteValue(Script.Handle handle, Script.InternalId internalId, Script.ListRemoteValue value) {
        this.handle = Script.Handle;
        this.internalId = Script.InternalId;
        this.value = Script.ListRemoteValue;
        this.type = "nodelist";
    }

    private final nodelist type;
    public getType(nodelist type) {
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