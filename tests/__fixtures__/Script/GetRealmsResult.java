package org.openqa.selenium.bidirectional.Script;


public class GetRealmsResult {

    public GetRealmsResult() {
        
        this.realms = "Unknown[]";
    }

    private final Unknown[] realms;
    public getRealms(Unknown[] realms) {
        this.realms = realms;
    }

}