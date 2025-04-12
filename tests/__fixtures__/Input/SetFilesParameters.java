/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.Input;


public class SetFilesParameters {

    public SetFilesParameters(BrowsingContext.BrowsingContext context, Script.SharedReference element) {
        this.context = BrowsingContext.BrowsingContext;
        this.element = Script.SharedReference;
        this.files = "Unknown[]";
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Script.SharedReference element;
    public getElement(Script.SharedReference element) {
        this.element = element;
    }

    private final Unknown[] files;
    public getFiles(Unknown[] files) {
        this.files = files;
    }

}