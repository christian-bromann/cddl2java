/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.browsingcontext;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for browsingContext.PrintParameters command
 */
public class PrintParameters {

    /**
     * Creates a new PrintParameters instance
     */
    public PrintParameters(BrowsingContext.BrowsingContext context, Boolean background, BrowsingContext.PrintMarginParameters margin, Object orientation, BrowsingContext.PrintPageParameters page, List<Unknown> pageRanges, Float scale, Boolean shrinkToFit) {
        this.context = context;
        this.background = background;
        this.margin = margin;
        this.orientation = orientation;
        this.page = page;
        this.pageRanges = pageRanges;
        this.scale = scale;
        this.shrinkToFit = shrinkToFit;
        
    }

    private final BrowsingContext.BrowsingContext context;

    /**
     * Gets the context property
     * @return BrowsingContext.BrowsingContext value
     */
    public BrowsingContext.BrowsingContext getContext() {
        return this.context;
    }

    private final Boolean background;

    /**
     * Gets the background property
     * @return Boolean value
     */
    public Boolean getBackground() {
        return this.background;
    }

    private final BrowsingContext.PrintMarginParameters margin;

    /**
     * Gets the margin property
     * @return BrowsingContext.PrintMarginParameters value
     */
    public BrowsingContext.PrintMarginParameters getMargin() {
        return this.margin;
    }

    private final Object orientation;

    /**
     * Gets the orientation property
     * @return Object value
     */
    public Object getOrientation() {
        return this.orientation;
    }

    private final BrowsingContext.PrintPageParameters page;

    /**
     * Gets the page property
     * @return BrowsingContext.PrintPageParameters value
     */
    public BrowsingContext.PrintPageParameters getPage() {
        return this.page;
    }

    private final List<Unknown> pageRanges;

    /**
     * Gets the pageRanges property
     * @return List<Unknown> value
     */
    public List<Unknown> getPageRanges() {
        return this.pageRanges;
    }

    private final Float scale;

    /**
     * Gets the scale property
     * @return Float value
     */
    public Float getScale() {
        return this.scale;
    }

    private final Boolean shrinkToFit;

    /**
     * Gets the shrinkToFit property
     * @return Boolean value
     */
    public Boolean getShrinkToFit() {
        return this.shrinkToFit;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("context", this.context);
        toReturn.put("background", this.background);
        toReturn.put("margin", this.margin);
        toReturn.put("orientation", this.orientation);
        toReturn.put("page", this.page);
        toReturn.put("pageRanges", this.pageRanges);
        toReturn.put("scale", this.scale);
        toReturn.put("shrinkToFit", this.shrinkToFit);
        return toReturn;
    }

}