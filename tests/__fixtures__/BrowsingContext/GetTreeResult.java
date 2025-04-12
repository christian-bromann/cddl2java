package org.openqa.selenium.bidirectional.BrowsingContext;


public class GetTreeResult {

    public GetTreeResult(BrowsingContext.InfoList contexts) {
        this.contexts = BrowsingContext.InfoList;
        
    }

    private final BrowsingContext.InfoList contexts;
    public getContexts(BrowsingContext.InfoList contexts) {
        this.contexts = contexts;
    }

}