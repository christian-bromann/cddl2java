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
 * Represents parameters for webExtension.ExtensionArchivePath command
 */
public class ExtensionArchivePath {

    /**
     * Creates a new ExtensionArchivePath instance
     */
    public ExtensionArchivePath(String path) {
        this.path = path;
        this.type = "archivePath";
    }

    private final archivePath type;

    /**
     * Gets the type property
     * @return archivePath value
     */
    public archivePath getType() {
        return this.type;
    }

    private final String path;

    /**
     * Gets the path property
     * @return String value
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("type", this.type);
        toReturn.put("path", this.path);
        return toReturn;
    }

}