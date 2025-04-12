package org.openqa.selenium.bidirectional.Browser;


public class ClientWindowRectState {

    public ClientWindowRectState(long width, long height, int x, int y) {
        this.width = long;
        this.height = long;
        this.x = int;
        this.y = int;
        this.state = "normal";
    }

    private final normal state;
    public getState(normal state) {
        this.state = state;
    }

    private final long width;
    public getWidth(long width) {
        this.width = width;
    }

    private final long height;
    public getHeight(long height) {
        this.height = height;
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