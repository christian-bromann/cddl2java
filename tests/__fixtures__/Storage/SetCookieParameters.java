package org.openqa.selenium.bidirectional.Storage;


public class SetCookieParameters {

    public SetCookieParameters(Storage.PartialCookie cookie, Storage.PartitionDescriptor partition) {
        this.cookie = Storage.PartialCookie;
        this.partition = Storage.PartitionDescriptor;
        
    }

    private final Storage.PartialCookie cookie;
    public getCookie(Storage.PartialCookie cookie) {
        this.cookie = cookie;
    }

    private final Storage.PartitionDescriptor partition;
    public getPartition(Storage.PartitionDescriptor partition) {
        this.partition = partition;
    }

}