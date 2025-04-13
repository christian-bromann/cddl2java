/**
 * Java code templates for WebDriver BiDi Java code generation
 */

export const emptyResultTemplate: string = `package org.openqa.selenium.bidirectional;

/**
 * Represents an empty result from a WebDriver BiDi command
 */
public class EmptyResult {
    /**
     * Creates a new EmptyResult instance
     */
    public EmptyResult() {
        // Empty result has no properties
    }
}
`;

export const contextValueTemplate: string = `package org.openqa.selenium.bidirectional;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents a value with context in WebDriver BiDi protocol
 */
public class ContextValue {
    private final String context;
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * Creates a new ContextValue instance
     * @param context The context ID (typically a browsing context ID)
     */
    public ContextValue(String context) {
        this.context = context;
    }

    /**
     * Gets the context property
     * @return Context ID value
     */
    public String getContext() {
        return context;
    }

    /**
     * Adds an additional property to this value
     * @param key Property name
     * @param value Property value
     */
    public void addProperty(String key, Object value) {
        additionalProperties.put(key, value);
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> result = new HashMap<>(additionalProperties);
        result.put("context", context);
        return result;
    }
}`;

export const accessibilityValueTemplate: string = `package org.openqa.selenium.bidirectional;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents a value with accessibility properties in WebDriver BiDi protocol
 */
public class AccessibilityValue {
    private final String name;
    private final String role;
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * Creates a new AccessibilityValue instance
     * @param name The accessible name
     * @param role The accessible role
     */
    public AccessibilityValue(String name, String role) {
        this.name = name;
        this.role = role;
    }

    /**
     * Gets the name property
     * @return Name value
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the role property
     * @return Role value
     */
    public String getRole() {
        return role;
    }

    /**
     * Adds an additional property to this value
     * @param key Property name
     * @param value Property value
     */
    public void addProperty(String key, Object value) {
        additionalProperties.put(key, value);
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> result = new HashMap<>(additionalProperties);
        if (name != null) {
            result.put("name", name);
        }
        if (role != null) {
            result.put("role", role);
        }
        return result;
    }
}`;

export const pointerTypeTemplate: string = `package org.openqa.selenium.bidirectional.input;

/**
 * Represents pointer types in WebDriver BiDi protocol
 */
public enum PointerType {
    MOUSE("mouse"),
    PEN("pen"),
    TOUCH("touch");

    private final String value;

    PointerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static PointerType fromString(String text) {
        for (PointerType type : PointerType.values()) {
            if (type.value.equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No PointerType with value: " + text);
    }
}`;

export const originTemplate: string = `package org.openqa.selenium.bidirectional.input;

/**
 * Represents coordinate origin in WebDriver BiDi protocol
 */
public enum Origin {
    VIEWPORT("viewport"),
    POINTER("pointer"),
    ELEMENT("element");

    private final String value;

    Origin(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Origin fromString(String text) {
        for (Origin origin : Origin.values()) {
            if (origin.value.equalsIgnoreCase(text)) {
                return origin;
            }
        }
        throw new IllegalArgumentException("No Origin with value: " + text);
    }
}`;

export const capabilitiesTemplate: string = `package org.openqa.selenium.bidirectional.session;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents browser capabilities in WebDriver BiDi protocol
 */
public class Capabilities {
    private final Map<String, Object> capabilities;

    public Capabilities(Map<String, Object> capabilities) {
        this.capabilities = capabilities != null ? capabilities : new HashMap<>();
    }

    public Boolean getAcceptInsecureCerts() {
        return (Boolean) capabilities.get("acceptInsecureCerts");
    }

    public String getBrowserName() {
        return (String) capabilities.get("browserName");
    }

    public String getBrowserVersion() {
        return (String) capabilities.get("browserVersion");
    }

    public String getPlatformName() {
        return (String) capabilities.get("platformName");
    }

    public Boolean getSetWindowRect() {
        return (Boolean) capabilities.get("setWindowRect");
    }

    public String getUserAgent() {
        return (String) capabilities.get("userAgent");
    }

    public String getWebSocketUrl() {
        return (String) capabilities.get("webSocketUrl");
    }

    public Map<String, Object> asMap() {
        return new HashMap<>(capabilities);
    }
}`;

export const newResultTemplate: string = `package org.openqa.selenium.bidirectional.session;

import java.util.Map;

/**
 * Result for session.New command.
 * Auto-generated from the CDDL specification.
 */
public class NewResult {
    private final String sessionId;
    private final Capabilities capabilities;

    /**
     * Constructor for NewResult.
     *
     * @param sessionId The session ID
     * @param capabilities The capabilities map
     */
    public NewResult(String sessionId, Map<String, Object> capabilities) {
        this.sessionId = sessionId;
        this.capabilities = new Capabilities(capabilities);
    }

    /**
     * Get the session ID.
     *
     * @return The session ID
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Get the capabilities.
     *
     * @return The capabilities
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }
}`;

export const scriptLocalValue = `package org.openqa.selenium.bidirectional.script;

public class ScriptLocalValue {

}
`;

export const sourceActions = `package org.openqa.selenium.bidirectional.input;

public class SourceActions {

}

public class KeySourceAction {

}
`;
