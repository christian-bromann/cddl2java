package org.openqa.selenium.bidirectional.emulation;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class EmulationModule {

    /**
     * WebDriver Bidi command to send command method "emulation.setGeolocationOverride" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-emulation-setGeolocationOverride
     * @param params `EmulationSetGeolocationOverrideParameters` {@link https://w3c.github.io/webdriver-bidi/#command-emulation-setGeolocationOverride | command parameter}
     */
    public Command<EmptyResult> SetGeolocationOverride (SetGeolocationOverrideParameters parameters) {
        return new Command<>(
            "emulation.setGeolocationOverride",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}