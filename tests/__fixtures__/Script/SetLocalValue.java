package org.openqa.selenium.bidirectional.Script;


public class SetLocalValue {

    public SetLocalValue(Script.ListLocalValue value) {
        this.value = Script.ListLocalValue;
        this.type = "set";
    }

    private final set type;
    public getType(set type) {
        this.type = type;
    }

    private final Script.ListLocalValue value;
    public getValue(Script.ListLocalValue value) {
        this.value = value;
    }

}