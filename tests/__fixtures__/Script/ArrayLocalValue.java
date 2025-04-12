package org.openqa.selenium.bidirectional.Script;


public class ArrayLocalValue {

    public ArrayLocalValue(Script.ListLocalValue value) {
        this.value = Script.ListLocalValue;
        this.type = "array";
    }

    private final array type;
    public getType(array type) {
        this.type = type;
    }

    private final Script.ListLocalValue value;
    public getValue(Script.ListLocalValue value) {
        this.value = value;
    }

}