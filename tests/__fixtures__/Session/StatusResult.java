package org.openqa.selenium.bidirectional.Session;


public class StatusResult {

    public StatusResult(boolean ready, String message) {
        this.ready = boolean;
        this.message = String;
        
    }

    private final boolean ready;
    public getReady(boolean ready) {
        this.ready = ready;
    }

    private final String message;
    public getMessage(String message) {
        this.message = message;
    }

}