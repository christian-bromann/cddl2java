package org.openqa.selenium.bidirectional.Browser;


public class RemoveUserContextParameters {

    public RemoveUserContextParameters(Browser.UserContext userContext) {
        this.userContext = Browser.UserContext;
        
    }

    private final Browser.UserContext userContext;
    public getUserContext(Browser.UserContext userContext) {
        this.userContext = userContext;
    }

}