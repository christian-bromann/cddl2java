package org.openqa.selenium.bidirectional.script;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class ScriptModule {

    /**
     * WebDriver Bidi command to send command method "script.removePreloadScript" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-script-removePreloadScript
     * @param params `ScriptRemovePreloadScriptParameters` {@link https://w3c.github.io/webdriver-bidi/#command-script-removePreloadScript | command parameter}
     */
    public Command<EmptyResult> RemovePreloadScript (RemovePreloadScriptParameters parameters) {
        return new Command<>(
            "script.removePreloadScript",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}