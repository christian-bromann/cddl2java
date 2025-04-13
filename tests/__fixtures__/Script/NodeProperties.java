/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.script;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.bidirectional.*;

/**
 * Auto-generated class for WebDriver BiDi protocol
 * Represents parameters for script.NodeProperties command
 */
public class NodeProperties {

    /**
     * Creates a new NodeProperties instance
     */
    public NodeProperties(Long nodeType, Long childNodeCount, Unknown attributes, List<Unknown> children, String localName, Object mode, String namespaceURI, String nodeValue, Object shadowRoot) {
        this.nodeType = nodeType;
        this.childNodeCount = childNodeCount;
        this.attributes = attributes;
        this.children = children;
        this.localName = localName;
        this.mode = mode;
        this.namespaceURI = namespaceURI;
        this.nodeValue = nodeValue;
        this.shadowRoot = shadowRoot;
        
    }

    private final Long nodeType;

    /**
     * Gets the nodeType property
     * @return Long value
     */
    public Long getNodeType() {
        return this.nodeType;
    }

    private final Long childNodeCount;

    /**
     * Gets the childNodeCount property
     * @return Long value
     */
    public Long getChildNodeCount() {
        return this.childNodeCount;
    }

    private final Unknown attributes;

    /**
     * Gets the attributes property
     * @return Unknown value
     */
    public Unknown getAttributes() {
        return this.attributes;
    }

    private final List<Unknown> children;

    /**
     * Gets the children property
     * @return List<Unknown> value
     */
    public List<Unknown> getChildren() {
        return this.children;
    }

    private final String localName;

    /**
     * Gets the localName property
     * @return String value
     */
    public String getLocalName() {
        return this.localName;
    }

    private final Object mode;

    /**
     * Gets the mode property
     * @return Object value
     */
    public Object getMode() {
        return this.mode;
    }

    private final String namespaceURI;

    /**
     * Gets the namespaceURI property
     * @return String value
     */
    public String getNamespaceURI() {
        return this.namespaceURI;
    }

    private final String nodeValue;

    /**
     * Gets the nodeValue property
     * @return String value
     */
    public String getNodeValue() {
        return this.nodeValue;
    }

    private final Object shadowRoot;

    /**
     * Gets the shadowRoot property
     * @return Object value
     */
    public Object getShadowRoot() {
        return this.shadowRoot;
    }

    /**
     * Converts this object to a map for use with BiDi protocol
     * @return Map representation of this object
     */
    public Map<String, Object> asMap() {
        Map<String, Object> toReturn = new HashMap<>();
        toReturn.put("nodeType", this.nodeType);
        toReturn.put("childNodeCount", this.childNodeCount);
        toReturn.put("attributes", this.attributes);
        toReturn.put("children", this.children);
        toReturn.put("localName", this.localName);
        toReturn.put("mode", this.mode);
        toReturn.put("namespaceURI", this.namespaceURI);
        toReturn.put("nodeValue", this.nodeValue);
        toReturn.put("shadowRoot", this.shadowRoot);
        return toReturn;
    }

}