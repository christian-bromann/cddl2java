package org.openqa.selenium.bidirectional.Script;


public class DisownParameters {

    public DisownParameters(Script.Target target) {
        this.target = Script.Target;
        this.handles = "Unknown[]";
    }

    private final Unknown[] handles;
    public getHandles(Unknown[] handles) {
        this.handles = handles;
    }

    private final Script.Target target;
    public getTarget(Script.Target target) {
        this.target = target;
    }

}