package org.openqa.selenium.bidirectional.BrowsingContext;


public class BaseNavigationInfo {

    public BaseNavigationInfo(BrowsingContext.BrowsingContext context, Unknown navigation, long timestamp, String url) {
        this.context = BrowsingContext.BrowsingContext;
        this.navigation = Unknown;
        this.timestamp = long;
        this.url = String;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown navigation;
    public getNavigation(Unknown navigation) {
        this.navigation = navigation;
    }

    private final long timestamp;
    public getTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

}