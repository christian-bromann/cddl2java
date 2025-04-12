package org.openqa.selenium.bidirectional.BrowsingContext;


public class DownloadWillBeginParams {

    public DownloadWillBeginParams(String suggestedFilename) {
        this.suggestedFilename = String;
        
    }

    private final String suggestedFilename;
    public getSuggestedFilename(String suggestedFilename) {
        this.suggestedFilename = suggestedFilename;
    }

}