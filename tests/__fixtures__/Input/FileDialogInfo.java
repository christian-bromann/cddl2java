package org.openqa.selenium.bidirectional.Input;


public class FileDialogInfo {

    public FileDialogInfo(BrowsingContext.BrowsingContext context, Script.SharedReference element, boolean multiple) {
        this.context = BrowsingContext.BrowsingContext;
        this.element = Script.SharedReference;
        this.multiple = boolean;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Script.SharedReference element;
    public getElement(Script.SharedReference element) {
        this.element = element;
    }

    private final boolean multiple;
    public getMultiple(boolean multiple) {
        this.multiple = multiple;
    }

}