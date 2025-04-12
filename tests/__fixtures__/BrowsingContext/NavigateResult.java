package org.openqa.selenium.bidirectional.BrowsingContext;


public class NavigateResult {

    public NavigateResult(Unknown navigation, String url) {
        this.navigation = Unknown;
        this.url = String;
        
    }

    private final Unknown navigation;
    public getNavigation(Unknown navigation) {
        this.navigation = navigation;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

}