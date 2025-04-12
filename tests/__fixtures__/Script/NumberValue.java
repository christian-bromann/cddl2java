package org.openqa.selenium.bidirectional.Script;


public class NumberValue {

    public NumberValue(Unknown value) {
        this.value = Unknown;
        this.type = "number";
    }

    private final number type;
    public getType(number type) {
        this.type = type;
    }

    private final Unknown value;
    public getValue(Unknown value) {
        this.value = value;
    }

}