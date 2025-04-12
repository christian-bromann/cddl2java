package org.openqa.selenium.bidirectional.Browser;


public class UserContextInfo {

    public UserContextInfo(Browser.UserContext userContext) {
        this.userContext = Browser.UserContext;
        
    }

    private final Browser.UserContext userContext;
    public getUserContext(Browser.UserContext userContext) {
        this.userContext = userContext;
    }

}