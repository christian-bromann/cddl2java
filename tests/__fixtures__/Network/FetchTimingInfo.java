package org.openqa.selenium.bidirectional.Network;


public class FetchTimingInfo {

    public FetchTimingInfo(float timeOrigin, float requestTime, float redirectStart, float redirectEnd, float fetchStart, float dnsStart, float dnsEnd, float connectStart, float connectEnd, float tlsStart, float requestStart, float responseStart, float responseEnd) {
        this.timeOrigin = float;
        this.requestTime = float;
        this.redirectStart = float;
        this.redirectEnd = float;
        this.fetchStart = float;
        this.dnsStart = float;
        this.dnsEnd = float;
        this.connectStart = float;
        this.connectEnd = float;
        this.tlsStart = float;
        this.requestStart = float;
        this.responseStart = float;
        this.responseEnd = float;
        
    }

    private final float timeOrigin;
    public getTimeOrigin(float timeOrigin) {
        this.timeOrigin = timeOrigin;
    }

    private final float requestTime;
    public getRequestTime(float requestTime) {
        this.requestTime = requestTime;
    }

    private final float redirectStart;
    public getRedirectStart(float redirectStart) {
        this.redirectStart = redirectStart;
    }

    private final float redirectEnd;
    public getRedirectEnd(float redirectEnd) {
        this.redirectEnd = redirectEnd;
    }

    private final float fetchStart;
    public getFetchStart(float fetchStart) {
        this.fetchStart = fetchStart;
    }

    private final float dnsStart;
    public getDnsStart(float dnsStart) {
        this.dnsStart = dnsStart;
    }

    private final float dnsEnd;
    public getDnsEnd(float dnsEnd) {
        this.dnsEnd = dnsEnd;
    }

    private final float connectStart;
    public getConnectStart(float connectStart) {
        this.connectStart = connectStart;
    }

    private final float connectEnd;
    public getConnectEnd(float connectEnd) {
        this.connectEnd = connectEnd;
    }

    private final float tlsStart;
    public getTlsStart(float tlsStart) {
        this.tlsStart = tlsStart;
    }

    private final float requestStart;
    public getRequestStart(float requestStart) {
        this.requestStart = requestStart;
    }

    private final float responseStart;
    public getResponseStart(float responseStart) {
        this.responseStart = responseStart;
    }

    private final float responseEnd;
    public getResponseEnd(float responseEnd) {
        this.responseEnd = responseEnd;
    }

}