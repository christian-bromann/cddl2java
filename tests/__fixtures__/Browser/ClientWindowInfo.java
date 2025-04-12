package org.openqa.selenium.bidirectional.Browser;


public class ClientWindowInfo {

    public ClientWindowInfo(boolean active, Browser.ClientWindow clientWindow, long height, Unknown state, long width, int x, int y) {
        this.active = boolean;
        this.clientWindow = Browser.ClientWindow;
        this.height = long;
        this.state = Unknown;
        this.width = long;
        this.x = int;
        this.y = int;
        
    }

    private final boolean active;
    public getActive(boolean active) {
        this.active = active;
    }

    private final Browser.ClientWindow clientWindow;
    public getClientWindow(Browser.ClientWindow clientWindow) {
        this.clientWindow = clientWindow;
    }

    private final long height;
    public getHeight(long height) {
        this.height = height;
    }

    private final Unknown state;
    public getState(Unknown state) {
        this.state = state;
    }

    private final long width;
    public getWidth(long width) {
        this.width = width;
    }

    private final int x;
    public getX(int x) {
        this.x = x;
    }

    private final int y;
    public getY(int y) {
        this.y = y;
    }

}