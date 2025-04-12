package org.openqa.selenium.bidirectional.Network;


public class ContinueResponseParameters {

    public ContinueResponseParameters(Network.Request request, Network.AuthCredentials credentials, String reasonPhrase, long statusCode) {
        this.request = Network.Request;
        this.credentials = Network.AuthCredentials;
        this.reasonPhrase = String;
        this.statusCode = long;
        this.cookies = "Unknown[]";
        this.headers = "Unknown[]";
    }

    private final Network.Request request;
    public getRequest(Network.Request request) {
        this.request = request;
    }

    private final Unknown[] cookies;
    public getCookies(Unknown[] cookies) {
        this.cookies = cookies;
    }

    private final Network.AuthCredentials credentials;
    public getCredentials(Network.AuthCredentials credentials) {
        this.credentials = credentials;
    }

    private final Unknown[] headers;
    public getHeaders(Unknown[] headers) {
        this.headers = headers;
    }

    private final String reasonPhrase;
    public getReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }

    private final long statusCode;
    public getStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }

}