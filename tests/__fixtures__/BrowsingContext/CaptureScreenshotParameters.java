package org.openqa.selenium.bidirectional.BrowsingContext;


public class CaptureScreenshotParameters {

    public CaptureScreenshotParameters(BrowsingContext.BrowsingContext context, Unknown origin, BrowsingContext.ImageFormat format, BrowsingContext.ClipRectangle clip) {
        this.context = BrowsingContext.BrowsingContext;
        this.origin = Unknown;
        this.format = BrowsingContext.ImageFormat;
        this.clip = BrowsingContext.ClipRectangle;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown origin;
    public getOrigin(Unknown origin) {
        this.origin = origin;
    }

    private final BrowsingContext.ImageFormat format;
    public getFormat(BrowsingContext.ImageFormat format) {
        this.format = format;
    }

    private final BrowsingContext.ClipRectangle clip;
    public getClip(BrowsingContext.ClipRectangle clip) {
        this.clip = clip;
    }

}