package org.openqa.selenium.bidirectional.Network;


public class ContinueWithAuthCredentials {

    public ContinueWithAuthCredentials(Network.AuthCredentials credentials) {
        this.credentials = Network.AuthCredentials;
        this.action = "provideCredentials";
    }

    private final provideCredentials action;
    public getAction(provideCredentials action) {
        this.action = action;
    }

    private final Network.AuthCredentials credentials;
    public getCredentials(Network.AuthCredentials credentials) {
        this.credentials = credentials;
    }

}