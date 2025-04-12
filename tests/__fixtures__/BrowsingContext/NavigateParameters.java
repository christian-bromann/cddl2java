package org.openqa.selenium.bidirectional.BrowsingContext;


public class NavigateParameters {

    public NavigateParameters(BrowsingContext.BrowsingContext context, String url, BrowsingContext.ReadinessState wait) {
        this.context = BrowsingContext.BrowsingContext;
        this.url = String;
        this.wait = BrowsingContext.ReadinessState;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

    private final BrowsingContext.ReadinessState wait;
    public getWait(BrowsingContext.ReadinessState wait) {
        this.wait = wait;
    }

}