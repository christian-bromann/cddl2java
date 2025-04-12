package org.openqa.selenium.bidirectional.Network;


public class ResponseCompletedParameters {

    public ResponseCompletedParameters(Network.ResponseData response) {
        this.response = Network.ResponseData;
        
    }

    private final Network.ResponseData response;
    public getResponse(Network.ResponseData response) {
        this.response = response;
    }

}