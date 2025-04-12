package org.openqa.selenium.bidirectional.Script;


public class EvaluateResultSuccess {

    public EvaluateResultSuccess(Script.RemoteValue result, Script.Realm realm) {
        this.result = Script.RemoteValue;
        this.realm = Script.Realm;
        this.type = "success";
    }

    private final success type;
    public getType(success type) {
        this.type = type;
    }

    private final Script.RemoteValue result;
    public getResult(Script.RemoteValue result) {
        this.result = result;
    }

    private final Script.Realm realm;
    public getRealm(Script.Realm realm) {
        this.realm = realm;
    }

}