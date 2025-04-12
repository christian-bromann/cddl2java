package org.openqa.selenium.bidirectional.Session;


public class UnsubscribeByIDRequest {

    public UnsubscribeByIDRequest() {
        
        this.subscriptions = "Unknown[]";
    }

    private final Unknown[] subscriptions;
    public getSubscriptions(Unknown[] subscriptions) {
        this.subscriptions = subscriptions;
    }

}