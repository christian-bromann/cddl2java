package org.openqa.selenium.bidirectional.Browser;


public class SetClientWindowStateParameters {

    public SetClientWindowStateParameters(Browser.ClientWindow clientWindow) {
        this.clientWindow = Browser.ClientWindow;
        
    }

    private final Browser.ClientWindow clientWindow;
    public getClientWindow(Browser.ClientWindow clientWindow) {
        this.clientWindow = clientWindow;
    }

}