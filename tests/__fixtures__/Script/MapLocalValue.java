package org.openqa.selenium.bidirectional.Script;


public class MapLocalValue {

    public MapLocalValue(Script.MappingLocalValue value) {
        this.value = Script.MappingLocalValue;
        this.type = "map";
    }

    private final map type;
    public getType(map type) {
        this.type = type;
    }

    private final Script.MappingLocalValue value;
    public getValue(Script.MappingLocalValue value) {
        this.value = value;
    }

}