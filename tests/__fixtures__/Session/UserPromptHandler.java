package org.openqa.selenium.bidirectional.Session;


public class UserPromptHandler {

    public UserPromptHandler(Session.UserPromptHandlerType alert, Session.UserPromptHandlerType beforeUnload, Session.UserPromptHandlerType confirm, Session.UserPromptHandlerType default, Session.UserPromptHandlerType file, Session.UserPromptHandlerType prompt) {
        this.alert = Session.UserPromptHandlerType;
        this.beforeUnload = Session.UserPromptHandlerType;
        this.confirm = Session.UserPromptHandlerType;
        this.default = Session.UserPromptHandlerType;
        this.file = Session.UserPromptHandlerType;
        this.prompt = Session.UserPromptHandlerType;
        
    }

    private final Session.UserPromptHandlerType alert;
    public getAlert(Session.UserPromptHandlerType alert) {
        this.alert = alert;
    }

    private final Session.UserPromptHandlerType beforeUnload;
    public getBeforeUnload(Session.UserPromptHandlerType beforeUnload) {
        this.beforeUnload = beforeUnload;
    }

    private final Session.UserPromptHandlerType confirm;
    public getConfirm(Session.UserPromptHandlerType confirm) {
        this.confirm = confirm;
    }

    private final Session.UserPromptHandlerType default;
    public getDefault(Session.UserPromptHandlerType default) {
        this.default = default;
    }

    private final Session.UserPromptHandlerType file;
    public getFile(Session.UserPromptHandlerType file) {
        this.file = file;
    }

    private final Session.UserPromptHandlerType prompt;
    public getPrompt(Session.UserPromptHandlerType prompt) {
        this.prompt = prompt;
    }

}