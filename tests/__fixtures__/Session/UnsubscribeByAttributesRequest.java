package org.openqa.selenium.bidirectional.Session;


public class UnsubscribeByAttributesRequest {

    public UnsubscribeByAttributesRequest() {
        
        this.events = "Unknown[]";
        this.contexts = "Unknown[]";
    }

    private final Unknown[] events;
    public getEvents(Unknown[] events) {
        this.events = events;
    }

    private final Unknown[] contexts;
    public getContexts(Unknown[] contexts) {
        this.contexts = contexts;
    }

}