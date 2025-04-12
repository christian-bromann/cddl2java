package org.openqa.selenium.bidirectional.Network;


public class ResponseData {

    public ResponseData(String url, String protocol, long status, String statusText, boolean fromCache, String mimeType, long bytesReceived, Unknown headersSize, Unknown bodySize, Network.ResponseContent content) {
        this.url = String;
        this.protocol = String;
        this.status = long;
        this.statusText = String;
        this.fromCache = boolean;
        this.mimeType = String;
        this.bytesReceived = long;
        this.headersSize = Unknown;
        this.bodySize = Unknown;
        this.content = Network.ResponseContent;
        this.headers = "Unknown[]";
        this.authChallenges = "Unknown[]";
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

    private final String protocol;
    public getProtocol(String protocol) {
        this.protocol = protocol;
    }

    private final long status;
    public getStatus(long status) {
        this.status = status;
    }

    private final String statusText;
    public getStatusText(String statusText) {
        this.statusText = statusText;
    }

    private final boolean fromCache;
    public getFromCache(boolean fromCache) {
        this.fromCache = fromCache;
    }

    private final Unknown[] headers;
    public getHeaders(Unknown[] headers) {
        this.headers = headers;
    }

    private final String mimeType;
    public getMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    private final long bytesReceived;
    public getBytesReceived(long bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    private final Unknown headersSize;
    public getHeadersSize(Unknown headersSize) {
        this.headersSize = headersSize;
    }

    private final Unknown bodySize;
    public getBodySize(Unknown bodySize) {
        this.bodySize = bodySize;
    }

    private final Network.ResponseContent content;
    public getContent(Network.ResponseContent content) {
        this.content = content;
    }

    private final Unknown[] authChallenges;
    public getAuthChallenges(Unknown[] authChallenges) {
        this.authChallenges = authChallenges;
    }

}