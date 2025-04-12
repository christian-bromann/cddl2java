package org.openqa.selenium.bidirectional.BrowsingContext;


public class CreateParameters {

    public CreateParameters(BrowsingContext.CreateType type, BrowsingContext.BrowsingContext referenceContext, Unknown background, Browser.UserContext userContext) {
        this.type = BrowsingContext.CreateType;
        this.referenceContext = BrowsingContext.BrowsingContext;
        this.background = Unknown;
        this.userContext = Browser.UserContext;
        
    }

    private final BrowsingContext.CreateType type;
    public getType(BrowsingContext.CreateType type) {
        this.type = type;
    }

    private final BrowsingContext.BrowsingContext referenceContext;
    public getReferenceContext(BrowsingContext.BrowsingContext referenceContext) {
        this.referenceContext = referenceContext;
    }

    private final Unknown background;
    public getBackground(Unknown background) {
        this.background = background;
    }

    private final Browser.UserContext userContext;
    public getUserContext(Browser.UserContext userContext) {
        this.userContext = userContext;
    }

}