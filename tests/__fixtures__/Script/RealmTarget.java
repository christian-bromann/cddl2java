package org.openqa.selenium.bidirectional.Script;


public class RealmTarget {

    public RealmTarget(Script.Realm realm) {
        this.realm = Script.Realm;
        
    }

    private final Script.Realm realm;
    public getRealm(Script.Realm realm) {
        this.realm = realm;
    }

}