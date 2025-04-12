package org.openqa.selenium.bidirectional.BrowsingContext;


public class GetTreeParameters {

    public GetTreeParameters(long maxDepth, BrowsingContext.BrowsingContext root) {
        this.maxDepth = long;
        this.root = BrowsingContext.BrowsingContext;
        
    }

    private final long maxDepth;
    public getMaxDepth(long maxDepth) {
        this.maxDepth = maxDepth;
    }

    private final BrowsingContext.BrowsingContext root;
    public getRoot(BrowsingContext.BrowsingContext root) {
        this.root = root;
    }

}