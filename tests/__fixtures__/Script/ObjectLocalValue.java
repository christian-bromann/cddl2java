package org.openqa.selenium.bidirectional.Script;


public class ObjectLocalValue {

    public ObjectLocalValue(Script.MappingLocalValue value) {
        this.value = Script.MappingLocalValue;
        this.type = "object";
    }

    private final object type;
    public getType(object type) {
        this.type = type;
    }

    private final Script.MappingLocalValue value;
    public getValue(Script.MappingLocalValue value) {
        this.value = value;
    }

}