package org.openqa.selenium.bidirectional.Network;


public class SetCacheBehaviorParameters {

    public SetCacheBehaviorParameters(Unknown cacheBehavior) {
        this.cacheBehavior = Unknown;
        this.contexts = "Unknown[]";
    }

    private final Unknown cacheBehavior;
    public getCacheBehavior(Unknown cacheBehavior) {
        this.cacheBehavior = cacheBehavior;
    }

    private final Unknown[] contexts;
    public getContexts(Unknown[] contexts) {
        this.contexts = contexts;
    }

}