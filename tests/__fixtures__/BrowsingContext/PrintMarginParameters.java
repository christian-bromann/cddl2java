package org.openqa.selenium.bidirectional.BrowsingContext;


public class PrintMarginParameters {

    public PrintMarginParameters(float bottom, float left, float right, float top) {
        this.bottom = float;
        this.left = float;
        this.right = float;
        this.top = float;
        
    }

    private final float bottom;
    public getBottom(float bottom) {
        this.bottom = bottom;
    }

    private final float left;
    public getLeft(float left) {
        this.left = left;
    }

    private final float right;
    public getRight(float right) {
        this.right = right;
    }

    private final float top;
    public getTop(float top) {
        this.top = top;
    }

}