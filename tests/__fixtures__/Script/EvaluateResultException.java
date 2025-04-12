package org.openqa.selenium.bidirectional.Script;


public class EvaluateResultException {

    public EvaluateResultException(Script.ExceptionDetails exceptionDetails, Script.Realm realm) {
        this.exceptionDetails = Script.ExceptionDetails;
        this.realm = Script.Realm;
        this.type = "exception";
    }

    private final exception type;
    public getType(exception type) {
        this.type = type;
    }

    private final Script.ExceptionDetails exceptionDetails;
    public getExceptionDetails(Script.ExceptionDetails exceptionDetails) {
        this.exceptionDetails = exceptionDetails;
    }

    private final Script.Realm realm;
    public getRealm(Script.Realm realm) {
        this.realm = realm;
    }

}