package org.openqa.selenium.bidirectional.BrowsingContext;


public class SetViewportParameters {

    public SetViewportParameters(BrowsingContext.BrowsingContext context, Unknown viewport, Unknown devicePixelRatio) {
        this.context = BrowsingContext.BrowsingContext;
        this.viewport = Unknown;
        this.devicePixelRatio = Unknown;
        this.userContexts = "Unknown[]";
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown viewport;
    public getViewport(Unknown viewport) {
        this.viewport = viewport;
    }

    private final Unknown devicePixelRatio;
    public getDevicePixelRatio(Unknown devicePixelRatio) {
        this.devicePixelRatio = devicePixelRatio;
    }

    private final Unknown[] userContexts;
    public getUserContexts(Unknown[] userContexts) {
        this.userContexts = userContexts;
    }

}