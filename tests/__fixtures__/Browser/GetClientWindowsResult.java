package org.openqa.selenium.bidirectional.Browser;


public class GetClientWindowsResult {

    public GetClientWindowsResult() {
        
        this.clientWindows = "Unknown[]";
    }

    private final Unknown[] clientWindows;
    public getClientWindows(Unknown[] clientWindows) {
        this.clientWindows = clientWindows;
    }

}