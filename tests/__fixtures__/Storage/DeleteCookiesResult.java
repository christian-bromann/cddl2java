package org.openqa.selenium.bidirectional.Storage;


public class DeleteCookiesResult {

    public DeleteCookiesResult(Storage.PartitionKey partitionKey) {
        this.partitionKey = Storage.PartitionKey;
        
    }

    private final Storage.PartitionKey partitionKey;
    public getPartitionKey(Storage.PartitionKey partitionKey) {
        this.partitionKey = partitionKey;
    }

}