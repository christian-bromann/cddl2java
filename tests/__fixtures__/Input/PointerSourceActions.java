package org.openqa.selenium.bidirectional.Input;


public class PointerSourceActions {

    public PointerSourceActions(String id, Input.PointerParameters parameters) {
        this.id = String;
        this.parameters = Input.PointerParameters;
        this.type = "pointer";
        this.actions = "Unknown[]";
    }

    private final pointer type;
    public getType(pointer type) {
        this.type = type;
    }

    private final String id;
    public getId(String id) {
        this.id = id;
    }

    private final Input.PointerParameters parameters;
    public getParameters(Input.PointerParameters parameters) {
        this.parameters = parameters;
    }

    private final Unknown[] actions;
    public getActions(Unknown[] actions) {
        this.actions = actions;
    }

}