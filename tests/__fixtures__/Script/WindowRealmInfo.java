/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.Script;


public class WindowRealmInfo {

    public WindowRealmInfo(BrowsingContext.BrowsingContext context, String sandbox) {
        this.context = BrowsingContext.BrowsingContext;
        this.sandbox = String;
        this.type = "window";
    }

    private final window type;
    public getType(window type) {
        this.type = type;
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final String sandbox;
    public getSandbox(String sandbox) {
        this.sandbox = sandbox;
    }

}