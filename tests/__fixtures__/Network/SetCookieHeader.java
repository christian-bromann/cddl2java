package org.openqa.selenium.bidirectional.Network;


public class SetCookieHeader {

    public SetCookieHeader(String name, Network.BytesValue value, String domain, boolean httpOnly, String expiry, int maxAge, String path, Network.SameSite sameSite, boolean secure) {
        this.name = String;
        this.value = Network.BytesValue;
        this.domain = String;
        this.httpOnly = boolean;
        this.expiry = String;
        this.maxAge = int;
        this.path = String;
        this.sameSite = Network.SameSite;
        this.secure = boolean;
        
    }

    private final String name;
    public getName(String name) {
        this.name = name;
    }

    private final Network.BytesValue value;
    public getValue(Network.BytesValue value) {
        this.value = value;
    }

    private final String domain;
    public getDomain(String domain) {
        this.domain = domain;
    }

    private final boolean httpOnly;
    public getHttpOnly(boolean httpOnly) {
        this.httpOnly = httpOnly;
    }

    private final String expiry;
    public getExpiry(String expiry) {
        this.expiry = expiry;
    }

    private final int maxAge;
    public getMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    private final String path;
    public getPath(String path) {
        this.path = path;
    }

    private final Network.SameSite sameSite;
    public getSameSite(Network.SameSite sameSite) {
        this.sameSite = sameSite;
    }

    private final boolean secure;
    public getSecure(boolean secure) {
        this.secure = secure;
    }

}