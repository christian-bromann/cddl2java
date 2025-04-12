package org.openqa.selenium.bidirectional.Script;


public class Source {

    public Source(Script.Realm realm, BrowsingContext.BrowsingContext context) {
        this.realm = Script.Realm;
        this.context = BrowsingContext.BrowsingContext;
        
    }

    private final Script.Realm realm;
    public getRealm(Script.Realm realm) {
        this.realm = realm;
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

}