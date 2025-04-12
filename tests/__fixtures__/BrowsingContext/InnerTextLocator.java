package org.openqa.selenium.bidirectional.BrowsingContext;


public class InnerTextLocator {

    public InnerTextLocator(String value, boolean ignoreCase, Unknown matchType, long maxDepth) {
        this.value = String;
        this.ignoreCase = boolean;
        this.matchType = Unknown;
        this.maxDepth = long;
        this.type = "innerText";
    }

    private final innerText type;
    public getType(innerText type) {
        this.type = type;
    }

    private final String value;
    public getValue(String value) {
        this.value = value;
    }

    private final boolean ignoreCase;
    public getIgnoreCase(boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

    private final Unknown matchType;
    public getMatchType(Unknown matchType) {
        this.matchType = matchType;
    }

    private final long maxDepth;
    public getMaxDepth(long maxDepth) {
        this.maxDepth = maxDepth;
    }

}