package org.openqa.selenium.bidirectional.BrowsingContext;


public class LocateNodesParameters {

    public LocateNodesParameters(BrowsingContext.BrowsingContext context, BrowsingContext.Locator locator, Unknown maxNodeCount, Script.SerializationOptions serializationOptions) {
        this.context = BrowsingContext.BrowsingContext;
        this.locator = BrowsingContext.Locator;
        this.maxNodeCount = Unknown;
        this.serializationOptions = Script.SerializationOptions;
        this.startNodes = "Unknown[]";
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final BrowsingContext.Locator locator;
    public getLocator(BrowsingContext.Locator locator) {
        this.locator = locator;
    }

    private final Unknown maxNodeCount;
    public getMaxNodeCount(Unknown maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    private final Script.SerializationOptions serializationOptions;
    public getSerializationOptions(Script.SerializationOptions serializationOptions) {
        this.serializationOptions = serializationOptions;
    }

    private final Unknown[] startNodes;
    public getStartNodes(Unknown[] startNodes) {
        this.startNodes = startNodes;
    }

}