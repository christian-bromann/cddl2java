package org.openqa.selenium.bidirectional.Network;


public class ContinueRequestParameters {

    public ContinueRequestParameters(Network.Request request, Network.BytesValue body, String method, String url) {
        this.request = Network.Request;
        this.body = Network.BytesValue;
        this.method = String;
        this.url = String;
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

    private final String method;
    public getMethod(String method) {
        this.method = method;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

}