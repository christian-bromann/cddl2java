package org.openqa.selenium.bidirectional.Script;


public class GetRealmsParameters {

    public GetRealmsParameters(BrowsingContext.BrowsingContext context, Script.RealmType type) {
        this.context = BrowsingContext.BrowsingContext;
        this.type = Script.RealmType;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Script.RealmType type;
    public getType(Script.RealmType type) {
        this.type = type;
    }

}