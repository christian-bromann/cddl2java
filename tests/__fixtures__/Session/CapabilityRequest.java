package org.openqa.selenium.bidirectional.Session;


public class CapabilityRequest {

    public CapabilityRequest(boolean acceptInsecureCerts, String browserName, String browserVersion, String platformName, Session.ProxyConfiguration proxy, Session.UserPromptHandler unhandledPromptBehavior) {
        this.acceptInsecureCerts = boolean;
        this.browserName = String;
        this.browserVersion = String;
        this.platformName = String;
        this.proxy = Session.ProxyConfiguration;
        this.unhandledPromptBehavior = Session.UserPromptHandler;
        
    }

    private final boolean acceptInsecureCerts;
    public getAcceptInsecureCerts(boolean acceptInsecureCerts) {
        this.acceptInsecureCerts = acceptInsecureCerts;
    }

    private final String browserName;
    public getBrowserName(String browserName) {
        this.browserName = browserName;
    }

    private final String browserVersion;
    public getBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    private final String platformName;
    public getPlatformName(String platformName) {
        this.platformName = platformName;
    }

    private final Session.ProxyConfiguration proxy;
    public getProxy(Session.ProxyConfiguration proxy) {
        this.proxy = proxy;
    }

    private final Session.UserPromptHandler unhandledPromptBehavior;
    public getUnhandledPromptBehavior(Session.UserPromptHandler unhandledPromptBehavior) {
        this.unhandledPromptBehavior = unhandledPromptBehavior;
    }

}