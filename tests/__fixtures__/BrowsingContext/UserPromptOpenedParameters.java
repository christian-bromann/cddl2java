package org.openqa.selenium.bidirectional.BrowsingContext;


public class UserPromptOpenedParameters {

    public UserPromptOpenedParameters(BrowsingContext.BrowsingContext context, Session.UserPromptHandlerType handler, String message, BrowsingContext.UserPromptType type, String defaultValue) {
        this.context = BrowsingContext.BrowsingContext;
        this.handler = Session.UserPromptHandlerType;
        this.message = String;
        this.type = BrowsingContext.UserPromptType;
        this.defaultValue = String;
        
    }

    private final BrowsingContext.BrowsingContext context;
    public getContext(BrowsingContext.BrowsingContext context) {
        this.context = context;
    }

    private final Session.UserPromptHandlerType handler;
    public getHandler(Session.UserPromptHandlerType handler) {
        this.handler = handler;
    }

    private final String message;
    public getMessage(String message) {
        this.message = message;
    }

    private final BrowsingContext.UserPromptType type;
    public getType(BrowsingContext.UserPromptType type) {
        this.type = type;
    }

    private final String defaultValue;
    public getDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

}