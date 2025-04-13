/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.webextension;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for webExtension.UninstallParameters command
 */
public class UninstallParameters {

    /**
     * Creates a new UninstallParameters instance
     */
    public UninstallParameters(WebExtension.Extension extension) {
        this.extension = extension;
    }

    private final WebExtension.Extension extension;

    /**
     * Gets the extension property
     * @return WebExtension.Extension value
     */
    public WebExtension.Extension getExtension() {
        return this.extension;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("extension", this.extension);
        return toReturn;
    }

}