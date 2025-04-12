package org.openqa.selenium.bidirectional.Input;


public class ElementOrigin {

    public ElementOrigin(Script.SharedReference element) {
        this.element = Script.SharedReference;
        this.type = "element";
    }

    private final element type;
    public getType(element type) {
        this.type = type;
    }

    private final Script.SharedReference element;
    public getElement(Script.SharedReference element) {
        this.element = element;
    }

}