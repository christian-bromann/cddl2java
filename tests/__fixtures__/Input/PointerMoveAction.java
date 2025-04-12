package org.openqa.selenium.bidirectional.Input;


public class PointerMoveAction {

    public PointerMoveAction(float x, float y, long duration, Input.Origin origin) {
        this.x = float;
        this.y = float;
        this.duration = long;
        this.origin = Input.Origin;
        this.type = "pointerMove";
    }

    private final pointerMove type;
    public getType(pointerMove type) {
        this.type = type;
    }

    private final float x;
    public getX(float x) {
        this.x = x;
    }

    private final float y;
    public getY(float y) {
        this.y = y;
    }

    private final long duration;
    public getDuration(long duration) {
        this.duration = duration;
    }

    private final Input.Origin origin;
    public getOrigin(Input.Origin origin) {
        this.origin = origin;
    }

}