package org.openqa.selenium.bidirectional.storage;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class StorageModule {

    /**
     * WebDriver Bidi command to send command method "storage.deleteCookies" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-storage-deleteCookies
     * @param params `StorageDeleteCookiesParameters` {@link https://w3c.github.io/webdriver-bidi/#command-storage-deleteCookies | command parameter}
     */
    public Command<DeleteCookiesResult> DeleteCookies (DeleteCookiesParameters parameters) {
        return new Command<>(
            "storage.deleteCookies",
            parameters.asMap(),
            DeleteCookiesResult.class
        );
    }
}