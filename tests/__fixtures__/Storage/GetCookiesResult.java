package org.openqa.selenium.bidirectional.Storage;


public class GetCookiesResult {

    public GetCookiesResult(Storage.PartitionKey partitionKey) {
        this.partitionKey = Storage.PartitionKey;
        this.cookies = "Unknown[]";
    }

    private final Unknown[] cookies;
    public getCookies(Unknown[] cookies) {
        this.cookies = cookies;
    }

    private final Storage.PartitionKey partitionKey;
    public getPartitionKey(Storage.PartitionKey partitionKey) {
        this.partitionKey = partitionKey;
    }

}