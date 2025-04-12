package org.openqa.selenium.bidirectional.session;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class SessionModule {

    /**
     * WebDriver Bidi command to send command method "session.unsubscribe" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-session-unsubscribe
     * @param params `SessionUnsubscribeParameters` {@link https://w3c.github.io/webdriver-bidi/#command-session-unsubscribe | command parameter}
     */
    public Command<EmptyResult> Unsubscribe (UnsubscribeParameters parameters) {
        return new Command<>(
            "session.unsubscribe",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}