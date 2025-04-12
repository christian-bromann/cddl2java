package org.openqa.selenium.bidirectional.Storage;


public class CookieFilter {

    public CookieFilter(String name, Network.BytesValue value, String domain, String path, long size, boolean httpOnly, boolean secure, Network.SameSite sameSite, long expiry) {
        this.name = String;
        this.value = Network.BytesValue;
        this.domain = String;
        this.path = String;
        this.size = long;
        this.httpOnly = boolean;
        this.secure = boolean;
        this.sameSite = Network.SameSite;
        this.expiry = long;
        
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

    private final String path;
    public getPath(String path) {
        this.path = path;
    }

    private final long size;
    public getSize(long size) {
        this.size = size;
    }

    private final boolean httpOnly;
    public getHttpOnly(boolean httpOnly) {
        this.httpOnly = httpOnly;
    }

    private final boolean secure;
    public getSecure(boolean secure) {
        this.secure = secure;
    }

    private final Network.SameSite sameSite;
    public getSameSite(Network.SameSite sameSite) {
        this.sameSite = sameSite;
    }

    private final long expiry;
    public getExpiry(long expiry) {
        this.expiry = expiry;
    }

}