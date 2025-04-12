package org.openqa.selenium.bidirectional.Input;


public class PointerCommonProperties {

    public PointerCommonProperties(Unknown width, Unknown height, float pressure, float tangentialPressure, Unknown twist, Unknown altitudeAngle, Unknown azimuthAngle) {
        this.width = Unknown;
        this.height = Unknown;
        this.pressure = float;
        this.tangentialPressure = float;
        this.twist = Unknown;
        this.altitudeAngle = Unknown;
        this.azimuthAngle = Unknown;
        
    }

    private final Unknown width;
    public getWidth(Unknown width) {
        this.width = width;
    }

    private final Unknown height;
    public getHeight(Unknown height) {
        this.height = height;
    }

    private final float pressure;
    public getPressure(float pressure) {
        this.pressure = pressure;
    }

    private final float tangentialPressure;
    public getTangentialPressure(float tangentialPressure) {
        this.tangentialPressure = tangentialPressure;
    }

    private final Unknown twist;
    public getTwist(Unknown twist) {
        this.twist = twist;
    }

    private final Unknown altitudeAngle;
    public getAltitudeAngle(Unknown altitudeAngle) {
        this.altitudeAngle = altitudeAngle;
    }

    private final Unknown azimuthAngle;
    public getAzimuthAngle(Unknown azimuthAngle) {
        this.azimuthAngle = azimuthAngle;
    }

}