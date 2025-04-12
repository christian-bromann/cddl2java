package org.openqa.selenium.bidirectional.BrowsingContext;


public class UserPromptClosedParameters {

    public UserPromptClosedParameters(BrowsingContext.BrowsingContext context, boolean accepted, BrowsingContext.UserPromptType type, String userText) {
        this.context = BrowsingContext.BrowsingContext;
        this.accepted = boolean;
        this.type = BrowsingContext.UserPromptType;
        this.userText = String;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final boolean accepted;
    public getAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    private final BrowsingContext.UserPromptType type;
    public getType(BrowsingContext.UserPromptType type) {
        this.type = type;
    }

    private final String userText;
    public getUserText(String userText) {
        this.userText = userText;
    }

}