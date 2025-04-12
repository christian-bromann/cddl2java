package org.openqa.selenium.bidirectional.Storage;


public class BrowsingContextPartitionDescriptor {

    public BrowsingContextPartitionDescriptor(BrowsingContext.BrowsingContext context) {
        this.context = BrowsingContext.BrowsingContext;
        this.type = "context";
    }

    private final context type;
    public getType(context type) {
        this.type = type;
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

}