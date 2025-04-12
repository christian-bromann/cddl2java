package org.openqa.selenium.bidirectional.Browser;


public class GetUserContextsResult {

    public GetUserContextsResult() {
        
        this.userContexts = "Unknown[]";
    }

    private final Unknown[] userContexts;
    public getUserContexts(Unknown[] userContexts) {
        this.userContexts = userContexts;
    }

}