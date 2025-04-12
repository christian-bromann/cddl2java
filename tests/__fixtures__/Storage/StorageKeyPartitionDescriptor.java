package org.openqa.selenium.bidirectional.Storage;


public class StorageKeyPartitionDescriptor {

    public StorageKeyPartitionDescriptor(String userContext, String sourceOrigin) {
        this.userContext = String;
        this.sourceOrigin = String;
        this.type = "storageKey";
    }

    private final storageKey type;
    public getType(storageKey type) {
        this.type = type;
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