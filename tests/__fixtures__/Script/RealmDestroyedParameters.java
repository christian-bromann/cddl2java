package org.openqa.selenium.bidirectional.Script;


public class RealmDestroyedParameters {

    public RealmDestroyedParameters(Script.Realm realm) {
        this.realm = Script.Realm;
        
    }

    private final Script.Realm realm;
    public getRealm(Script.Realm realm) {
        this.realm = realm;
    }

}