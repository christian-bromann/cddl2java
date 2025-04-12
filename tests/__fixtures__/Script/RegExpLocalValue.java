package org.openqa.selenium.bidirectional.Script;


public class RegExpLocalValue {

    public RegExpLocalValue(Script.RegExpValue value) {
        this.value = Script.RegExpValue;
        this.type = "regexp";
    }

    private final regexp type;
    public getType(regexp type) {
        this.type = type;
    }

    private final Script.RegExpValue value;
    public getValue(Script.RegExpValue value) {
        this.value = value;
    }

}