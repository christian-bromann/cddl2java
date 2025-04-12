package org.openqa.selenium.bidirectional.input;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class InputModule {

    /**
     * WebDriver Bidi command to send command method "input.fileDialogOpened" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-input-fileDialogOpened
     * @param params `InputFileDialogInfo` {@link https://w3c.github.io/webdriver-bidi/#command-input-fileDialogOpened | command parameter}
     */
    public Command<EmptyResult> FileDialogOpened (FileDialogInfo parameters) {
        return new Command<>(
            "input.fileDialogOpened",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}