package org.openqa.selenium.bidirectional.Network;


public class FailRequestParameters {

    public FailRequestParameters(Network.Request request) {
        this.request = Network.Request;
        
    }

    private final Network.Request request;
    public getRequest(Network.Request request) {
        this.request = request;
    }

}