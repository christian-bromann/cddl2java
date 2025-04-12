package org.openqa.selenium.bidirectional.Network;


public class AddInterceptParameters {

    public AddInterceptParameters() {
        
        this.phases = "Unknown[]";
        this.contexts = "Unknown[]";
        this.urlPatterns = "Unknown[]";
    }

    private final Unknown[] phases;
    public getPhases(Unknown[] phases) {
        this.phases = phases;
    }

    private final Unknown[] contexts;
    public getContexts(Unknown[] contexts) {
        this.contexts = contexts;
    }

    private final Unknown[] urlPatterns;
    public getUrlPatterns(Unknown[] urlPatterns) {
        this.urlPatterns = urlPatterns;
    }

}