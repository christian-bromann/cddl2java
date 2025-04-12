package org.openqa.selenium.bidirectional.BrowsingContext;


public class TraverseHistoryParameters {

    public TraverseHistoryParameters(BrowsingContext.BrowsingContext context, int delta) {
        this.context = BrowsingContext.BrowsingContext;
        this.delta = int;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final int delta;
    public getDelta(int delta) {
        this.delta = delta;
    }

}