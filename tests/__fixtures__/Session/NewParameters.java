package org.openqa.selenium.bidirectional.Session;


public class NewParameters {

    public NewParameters(Session.CapabilitiesRequest capabilities) {
        this.capabilities = Session.CapabilitiesRequest;
        
    }

    private final Session.CapabilitiesRequest capabilities;
    public getCapabilities(Session.CapabilitiesRequest capabilities) {
        this.capabilities = capabilities;
    }

}