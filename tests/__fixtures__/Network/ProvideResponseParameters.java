package org.openqa.selenium.bidirectional.Network;


public class ProvideResponseParameters {

    public ProvideResponseParameters(Network.Request request, Network.BytesValue body, String reasonPhrase, long statusCode) {
        this.request = Network.Request;
        this.body = Network.BytesValue;
        this.reasonPhrase = String;
        this.statusCode = long;
        this.cookies = "Unknown[]";
        this.headers = "Unknown[]";
    }

    private final Network.Request request;
    public getRequest(Network.Request request) {
        this.request = request;
    }

    private final Network.BytesValue body;
    public getBody(Network.BytesValue body) {
        this.body = body;
    }

    private final Unknown[] cookies;
    public getCookies(Unknown[] cookies) {
        this.cookies = cookies;
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