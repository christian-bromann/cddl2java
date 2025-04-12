package org.openqa.selenium.bidirectional.Network;


public class ResponseStartedParameters {

    public ResponseStartedParameters(Network.ResponseData response) {
        this.response = Network.ResponseData;
        
    }

    private final Network.ResponseData response;
    public getResponse(Network.ResponseData response) {
        this.response = response;
    }

}