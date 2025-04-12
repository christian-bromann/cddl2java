package org.openqa.selenium.bidirectional.Network;


public class UrlPatternPattern {

    public UrlPatternPattern(String protocol, String hostname, String port, String pathname, String search) {
        this.protocol = String;
        this.hostname = String;
        this.port = String;
        this.pathname = String;
        this.search = String;
        this.type = "pattern";
    }

    private final pattern type;
    public getType(pattern type) {
        this.type = type;
    }

    private final String protocol;
    public getProtocol(String protocol) {
        this.protocol = protocol;
    }

    private final String hostname;
    public getHostname(String hostname) {
        this.hostname = hostname;
    }

    private final String port;
    public getPort(String port) {
        this.port = port;
    }

    private final String pathname;
    public getPathname(String pathname) {
        this.pathname = pathname;
    }

    private final String search;
    public getSearch(String search) {
        this.search = search;
    }

}