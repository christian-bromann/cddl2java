package org.openqa.selenium.bidirectional.Network;


public class RequestData {

    public RequestData(Network.Request request, String url, String method, long headersSize, Unknown bodySize, String destination, Unknown initiatorType, Network.FetchTimingInfo timings) {
        this.request = Network.Request;
        this.url = String;
        this.method = String;
        this.headersSize = long;
        this.bodySize = Unknown;
        this.destination = String;
        this.initiatorType = Unknown;
        this.timings = Network.FetchTimingInfo;
        this.headers = "Unknown[]";
        this.cookies = "Unknown[]";
    }

    private final Network.Request request;
    public getRequest(Network.Request request) {
        this.request = request;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

    private final String method;
    public getMethod(String method) {
        this.method = method;
    }

    private final Unknown[] headers;
    public getHeaders(Unknown[] headers) {
        this.headers = headers;
    }

    private final Unknown[] cookies;
    public getCookies(Unknown[] cookies) {
        this.cookies = cookies;
    }

    private final long headersSize;
    public getHeadersSize(long headersSize) {
        this.headersSize = headersSize;
    }

    private final Unknown bodySize;
    public getBodySize(Unknown bodySize) {
        this.bodySize = bodySize;
    }

    private final String destination;
    public getDestination(String destination) {
        this.destination = destination;
    }

    private final Unknown initiatorType;
    public getInitiatorType(Unknown initiatorType) {
        this.initiatorType = initiatorType;
    }

    private final Network.FetchTimingInfo timings;
    public getTimings(Network.FetchTimingInfo timings) {
        this.timings = timings;
    }

}