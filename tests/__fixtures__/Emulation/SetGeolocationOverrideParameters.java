package org.openqa.selenium.bidirectional.Emulation;


public class SetGeolocationOverrideParameters {

    public SetGeolocationOverrideParameters(Unknown coordinates) {
        this.coordinates = Unknown;
        this.contexts = "Unknown[]";
        this.userContexts = "Unknown[]";
    }

    private final Unknown coordinates;
    public getCoordinates(Unknown coordinates) {
        this.coordinates = coordinates;
    }

    private final Unknown[] contexts;
    public getContexts(Unknown[] contexts) {
        this.contexts = contexts;
    }

    private final Unknown[] userContexts;
    public getUserContexts(Unknown[] userContexts) {
        this.userContexts = userContexts;
    }

}