package org.openqa.selenium.bidirectional.Storage;


public class PartitionKey {

    public PartitionKey(String userContext, String sourceOrigin) {
        this.userContext = String;
        this.sourceOrigin = String;
        
    }

    private final String userContext;
    public getUserContext(String userContext) {
        this.userContext = userContext;
    }

    private final String sourceOrigin;
    public getSourceOrigin(String sourceOrigin) {
        this.sourceOrigin = sourceOrigin;
    }

}