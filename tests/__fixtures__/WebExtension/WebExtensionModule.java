package org.openqa.selenium.bidirectional.webextension;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class WebExtensionModule {

    /**
     * WebDriver Bidi command to send command method "webExtension.uninstall" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-webExtension-uninstall
     * @param params `WebExtensionUninstallParameters` {@link https://w3c.github.io/webdriver-bidi/#command-webExtension-uninstall | command parameter}
     */
    public Command<EmptyResult> Uninstall (UninstallParameters parameters) {
        return new Command<>(
            "webExtension.uninstall",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}