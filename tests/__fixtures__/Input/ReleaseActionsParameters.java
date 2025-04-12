package org.openqa.selenium.bidirectional.Input;


public class ReleaseActionsParameters {

    public ReleaseActionsParameters(BrowsingContext.BrowsingContext context) {
        this.context = BrowsingContext.BrowsingContext;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

}