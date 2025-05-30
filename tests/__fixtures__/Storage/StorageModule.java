/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.storage;

import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto generated class for running WebDriver BiDi storage commands in Java
 */
public class StorageModule {

    /**
     * WebDriver Bidi command to send command method "storage.deleteCookies" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-storage-deleteCookies
     * @param parameters `DeleteCookiesParameters` {@link https://w3c.github.io/webdriver-bidi/#command-storage-deleteCookies | command parameter}
     * @return Command object with result type for storage.deleteCookies
     */
    public Command<DeleteCookiesResult> DeleteCookies (DeleteCookiesParameters parameters) {
        return new Command<>(
            "storage.deleteCookies",
            parameters.asMap(),
            DeleteCookiesResult.class
        );
    }
}