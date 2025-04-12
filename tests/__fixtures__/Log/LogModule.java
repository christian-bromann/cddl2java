package org.openqa.selenium.bidirectional.log;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class LogModule {

    /**
     * WebDriver Bidi command to send command method "log.entryAdded" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-log-entryAdded
     * @param params `LogEntry` {@link https://w3c.github.io/webdriver-bidi/#command-log-entryAdded | command parameter}
     */
    public Command<EmptyResult> EntryAdded (Entry parameters) {
        return new Command<>(
            "log.entryAdded",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}