package org.openqa.selenium.bidirectional.BrowsingContext;


public class Info {

    public Info(Unknown children, Browser.ClientWindow clientWindow, BrowsingContext.BrowsingContext context, Unknown originalOpener, String url, Browser.UserContext userContext, Unknown parent) {
        this.children = Unknown;
        this.clientWindow = Browser.ClientWindow;
        this.context = BrowsingContext.BrowsingContext;
        this.originalOpener = Unknown;
        this.url = String;
        this.userContext = Browser.UserContext;
        this.parent = Unknown;
        
    }

    private final Unknown children;
    public getChildren(Unknown children) {
        this.children = children;
    }

    private final Browser.ClientWindow clientWindow;
    public getClientWindow(Browser.ClientWindow clientWindow) {
        this.clientWindow = clientWindow;
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown originalOpener;
    public getOriginalOpener(Unknown originalOpener) {
        this.originalOpener = originalOpener;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

    private final Browser.UserContext userContext;
    public getUserContext(Browser.UserContext userContext) {
        this.userContext = userContext;
    }

    private final Unknown parent;
    public getParent(Unknown parent) {
        this.parent = parent;
    }

}