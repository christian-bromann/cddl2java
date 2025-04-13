/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.emulation;

import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto generated class for running WebDriver BiDi emulation commands in Java
 */
public class EmulationModule {

    /**
     * WebDriver Bidi command to send command method "emulation.setGeolocationOverride" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-emulation-setGeolocationOverride
     * @param parameters `SetGeolocationOverrideParameters` {@link https://w3c.github.io/webdriver-bidi/#command-emulation-setGeolocationOverride | command parameter}
     * @return Command object with result type for emulation.setGeolocationOverride
     */
    public Command<org.openqa.selenium.bidirectional.EmptyResult> SetGeolocationOverride (SetGeolocationOverrideParameters parameters) {
        return new Command<>(
            "emulation.setGeolocationOverride",
            parameters.asMap(),
            org.openqa.selenium.bidirectional.EmptyResult.class
        );
    }
}