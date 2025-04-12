package org.openqa.selenium.bidirectional.BrowsingContext;


public class ReloadParameters {

    public ReloadParameters(BrowsingContext.BrowsingContext context, boolean ignoreCache, BrowsingContext.ReadinessState wait) {
        this.context = BrowsingContext.BrowsingContext;
        this.ignoreCache = boolean;
        this.wait = BrowsingContext.ReadinessState;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final boolean ignoreCache;
    public getIgnoreCache(boolean ignoreCache) {
        this.ignoreCache = ignoreCache;
    }

    private final BrowsingContext.ReadinessState wait;
    public getWait(BrowsingContext.ReadinessState wait) {
        this.wait = wait;
    }

}