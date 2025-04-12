package org.openqa.selenium.bidirectional.Input;


public class PerformActionsParameters {

    public PerformActionsParameters(BrowsingContext.BrowsingContext context) {
        this.context = BrowsingContext.BrowsingContext;
        this.actions = "Unknown[]";
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown[] actions;
    public getActions(Unknown[] actions) {
        this.actions = actions;
    }

}