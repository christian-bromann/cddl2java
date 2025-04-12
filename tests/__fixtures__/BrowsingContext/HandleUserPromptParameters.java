package org.openqa.selenium.bidirectional.BrowsingContext;


public class HandleUserPromptParameters {

    public HandleUserPromptParameters(BrowsingContext.BrowsingContext context, boolean accept, String userText) {
        this.context = BrowsingContext.BrowsingContext;
        this.accept = boolean;
        this.userText = String;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final boolean accept;
    public getAccept(boolean accept) {
        this.accept = accept;
    }

    private final String userText;
    public getUserText(String userText) {
        this.userText = userText;
    }

}