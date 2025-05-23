/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.input;

import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto generated class for running WebDriver BiDi input commands in Java
 */
public class InputModule {

    /**
     * WebDriver Bidi command to send command method "input.fileDialogOpened" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-input-fileDialogOpened
     * @param parameters `FileDialogInfo` {@link https://w3c.github.io/webdriver-bidi/#command-input-fileDialogOpened | command parameter}
     * @return Command object with result type for input.fileDialogOpened
     */
    public Command<org.openqa.selenium.bidirectional.EmptyResult> FileDialogOpened (FileDialogInfo parameters) {
        return new Command<>(
            "input.fileDialogOpened",
            parameters.asMap(),
            org.openqa.selenium.bidirectional.EmptyResult.class
        );
    }
}