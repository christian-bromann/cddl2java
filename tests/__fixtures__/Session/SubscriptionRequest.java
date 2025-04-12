package org.openqa.selenium.bidirectional.Session;


public class SubscriptionRequest {

    public SubscriptionRequest() {
        
        this.events = "Unknown[]";
        this.contexts = "Unknown[]";
        this.userContexts = "Unknown[]";
    }

    private final Unknown[] events;
    public getEvents(Unknown[] events) {
        this.events = events;
    }

    private final Unknown[] contexts;
    public getContexts(Unknown[] contexts) {
        this.contexts = contexts;
    }

    private final Unknown[] userContexts;
    public getUserContexts(Unknown[] userContexts) {
        this.userContexts = userContexts;
    }

}