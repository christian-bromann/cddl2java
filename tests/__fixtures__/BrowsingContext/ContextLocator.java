package org.openqa.selenium.bidirectional.BrowsingContext;


public class ContextLocator {

    public ContextLocator(Unknown value) {
        this.value = Unknown;
        this.type = "context";
    }

    private final context type;
    public getType(context type) {
        this.type = type;
    }

    private final Unknown value;
    public getValue(Unknown value) {
        this.value = value;
    }

}