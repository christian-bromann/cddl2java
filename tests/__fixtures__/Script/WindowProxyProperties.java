package org.openqa.selenium.bidirectional.Script;


public class WindowProxyProperties {

    public WindowProxyProperties(BrowsingContext.BrowsingContext context) {
        this.context = BrowsingContext.BrowsingContext;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

}