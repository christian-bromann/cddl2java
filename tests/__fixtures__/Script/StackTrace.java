package org.openqa.selenium.bidirectional.Script;


public class StackTrace {

    public StackTrace() {
        
        this.callFrames = "Unknown[]";
    }

    private final Unknown[] callFrames;
    public getCallFrames(Unknown[] callFrames) {
        this.callFrames = callFrames;
    }

}