package org.openqa.selenium.bidirectional.BrowsingContext;


public class CloseParameters {

    public CloseParameters(BrowsingContext.BrowsingContext context, Unknown promptUnload) {
        this.context = BrowsingContext.BrowsingContext;
        this.promptUnload = Unknown;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown promptUnload;
    public getPromptUnload(Unknown promptUnload) {
        this.promptUnload = promptUnload;
    }

}