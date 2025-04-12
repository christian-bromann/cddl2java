package org.openqa.selenium.bidirectional.Emulation;


public class GeolocationCoordinates {

    public GeolocationCoordinates(float latitude, float longitude, float accuracy, Unknown altitude, Unknown altitudeAccuracy, Unknown heading, Unknown speed) {
        this.latitude = float;
        this.longitude = float;
        this.accuracy = float;
        this.altitude = Unknown;
        this.altitudeAccuracy = Unknown;
        this.heading = Unknown;
        this.speed = Unknown;
        
    }

    private final float latitude;
    public getLatitude(float latitude) {
        this.latitude = latitude;
    }

    private final float longitude;
    public getLongitude(float longitude) {
        this.longitude = longitude;
    }

    private final float accuracy;
    public getAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    private final Unknown altitude;
    public getAltitude(Unknown altitude) {
        this.altitude = altitude;
    }

    private final Unknown altitudeAccuracy;
    public getAltitudeAccuracy(Unknown altitudeAccuracy) {
        this.altitudeAccuracy = altitudeAccuracy;
    }

    private final Unknown heading;
    public getHeading(Unknown heading) {
        this.heading = heading;
    }

    private final Unknown speed;
    public getSpeed(Unknown speed) {
        this.speed = speed;
    }

}