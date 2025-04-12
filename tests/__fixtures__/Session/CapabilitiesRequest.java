package org.openqa.selenium.bidirectional.Session;


public class CapabilitiesRequest {

    public CapabilitiesRequest(Session.CapabilityRequest alwaysMatch) {
        this.alwaysMatch = Session.CapabilityRequest;
        this.firstMatch = "Unknown[]";
    }

    private final Session.CapabilityRequest alwaysMatch;
    public getAlwaysMatch(Session.CapabilityRequest alwaysMatch) {
        this.alwaysMatch = alwaysMatch;
    }

    private final Unknown[] firstMatch;
    public getFirstMatch(Unknown[] firstMatch) {
        this.firstMatch = firstMatch;
    }

}