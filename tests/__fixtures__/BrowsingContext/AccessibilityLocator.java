package org.openqa.selenium.bidirectional.BrowsingContext;


public class AccessibilityLocator {

    public AccessibilityLocator(Unknown value) {
        this.value = Unknown;
        this.type = "accessibility";
    }

    private final accessibility type;
    public getType(accessibility type) {
        this.type = type;
    }

    private final Unknown value;
    public getValue(Unknown value) {
        this.value = value;
    }

}