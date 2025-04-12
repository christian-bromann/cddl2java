package org.openqa.selenium.bidirectional.Input;


public class WheelScrollAction {

    public WheelScrollAction(int x, int y, int deltaX, int deltaY, long duration, Unknown origin) {
        this.x = int;
        this.y = int;
        this.deltaX = int;
        this.deltaY = int;
        this.duration = long;
        this.origin = Unknown;
        this.type = "scroll";
    }

    private final scroll type;
    public getType(scroll type) {
        this.type = type;
    }

    private final int x;
    public getX(int x) {
        this.x = x;
    }

    private final int y;
    public getY(int y) {
        this.y = y;
    }

    private final int deltaX;
    public getDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    private final int deltaY;
    public getDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

    private final long duration;
    public getDuration(long duration) {
        this.duration = duration;
    }

    private final Unknown origin;
    public getOrigin(Unknown origin) {
        this.origin = origin;
    }

}