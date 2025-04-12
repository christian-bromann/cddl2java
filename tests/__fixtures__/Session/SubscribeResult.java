package org.openqa.selenium.bidirectional.Session;


public class SubscribeResult {

    public SubscribeResult(Session.Subscription subscription) {
        this.subscription = Session.Subscription;
        
    }

    private final Session.Subscription subscription;
    public getSubscription(Session.Subscription subscription) {
        this.subscription = subscription;
    }

}