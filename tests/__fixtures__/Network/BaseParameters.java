package org.openqa.selenium.bidirectional.Network;


public class BaseParameters {

    public BaseParameters(Unknown context, boolean isBlocked, Unknown navigation, long redirectCount, Network.RequestData request, long timestamp) {
        this.context = Unknown;
        this.isBlocked = boolean;
        this.navigation = Unknown;
        this.redirectCount = long;
        this.request = Network.RequestData;
        this.timestamp = long;
        this.intercepts = "Unknown[]";
    }

    private final Unknown context;
    public getContext(Unknown context) {
        this.context = context;
    }

    private final boolean isBlocked;
    public getIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    private final Unknown navigation;
    public getNavigation(Unknown navigation) {
        this.navigation = navigation;
    }

    private final long redirectCount;
    public getRedirectCount(long redirectCount) {
        this.redirectCount = redirectCount;
    }

    private final Network.RequestData request;
    public getRequest(Network.RequestData request) {
        this.request = request;
    }

    private final long timestamp;
    public getTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private final Unknown[] intercepts;
    public getIntercepts(Unknown[] intercepts) {
        this.intercepts = intercepts;
    }

}