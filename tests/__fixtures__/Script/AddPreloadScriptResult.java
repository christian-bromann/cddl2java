package org.openqa.selenium.bidirectional.Script;


public class AddPreloadScriptResult {

    public AddPreloadScriptResult(Script.PreloadScript script) {
        this.script = Script.PreloadScript;
        
    }

    private final Script.PreloadScript script;
    public getScript(Script.PreloadScript script) {
        this.script = script;
    }

}