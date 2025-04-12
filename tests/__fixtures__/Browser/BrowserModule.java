package org.openqa.selenium.bidirectional.browser;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class BrowserModule {

    /**
     * WebDriver Bidi command to send command method "browser.setClientWindowState" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-browser-setClientWindowState
     * @param params `BrowserSetClientWindowStateParameters` {@link https://w3c.github.io/webdriver-bidi/#command-browser-setClientWindowState | command parameter}
     */
    public Command<EmptyResult> SetClientWindowState (SetClientWindowStateParameters parameters) {
        return new Command<>(
            "browser.setClientWindowState",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}