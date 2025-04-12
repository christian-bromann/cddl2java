/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.Input;


public class PerformActionsParameters {

    public PerformActionsParameters(BrowsingContext.BrowsingContext context) {
        this.context = BrowsingContext.BrowsingContext;
        this.actions = "Unknown[]";
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Unknown[] actions;
    public getActions(Unknown[] actions) {
        this.actions = actions;
    }

}