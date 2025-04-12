package org.openqa.selenium.bidirectional.BrowsingContext;


public class PrintParameters {

    public PrintParameters(BrowsingContext.BrowsingContext context, Unknown background, BrowsingContext.PrintMarginParameters margin, Unknown orientation, BrowsingContext.PrintPageParameters page, Unknown scale, Unknown shrinkToFit) {
        this.context = BrowsingContext.BrowsingContext;
        this.background = Unknown;
        this.margin = BrowsingContext.PrintMarginParameters;
        this.orientation = Unknown;
        this.page = BrowsingContext.PrintPageParameters;
        this.scale = Unknown;
        this.shrinkToFit = Unknown;
        this.pageRanges = "Unknown[]";
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown background;
    public getBackground(Unknown background) {
        this.background = background;
    }

    private final BrowsingContext.PrintMarginParameters margin;
    public getMargin(BrowsingContext.PrintMarginParameters margin) {
        this.margin = margin;
    }

    private final Unknown orientation;
    public getOrientation(Unknown orientation) {
        this.orientation = orientation;
    }

    private final BrowsingContext.PrintPageParameters page;
    public getPage(BrowsingContext.PrintPageParameters page) {
        this.page = page;
    }

    private final Unknown[] pageRanges;
    public getPageRanges(Unknown[] pageRanges) {
        this.pageRanges = pageRanges;
    }

    private final Unknown scale;
    public getScale(Unknown scale) {
        this.scale = scale;
    }

    private final Unknown shrinkToFit;
    public getShrinkToFit(Unknown shrinkToFit) {
        this.shrinkToFit = shrinkToFit;
    }

}