package org.openqa.selenium.bidirectional.Storage;


public class DeleteCookiesParameters {

    public DeleteCookiesParameters(Storage.CookieFilter filter, Storage.PartitionDescriptor partition) {
        this.filter = Storage.CookieFilter;
        this.partition = Storage.PartitionDescriptor;
        
    }

    private final Storage.CookieFilter filter;
    public getFilter(Storage.CookieFilter filter) {
        this.filter = filter;
    }

    private final Storage.PartitionDescriptor partition;
    public getPartition(Storage.PartitionDescriptor partition) {
        this.partition = partition;
    }

}