package org.openqa.selenium.bidirectional.Script;


public class NodeProperties {

    public NodeProperties(long nodeType, long childNodeCount, Unknown attributes, String localName, Unknown mode, String namespaceURI, String nodeValue, Unknown shadowRoot) {
        this.nodeType = long;
        this.childNodeCount = long;
        this.attributes = Unknown;
        this.localName = String;
        this.mode = Unknown;
        this.namespaceURI = String;
        this.nodeValue = String;
        this.shadowRoot = Unknown;
        this.children = "Unknown[]";
    }

    private final long nodeType;
    public getNodeType(long nodeType) {
        this.nodeType = nodeType;
    }

    private final long childNodeCount;
    public getChildNodeCount(long childNodeCount) {
        this.childNodeCount = childNodeCount;
    }

    private final Unknown attributes;
    public getAttributes(Unknown attributes) {
        this.attributes = attributes;
    }

    private final Unknown[] children;
    public getChildren(Unknown[] children) {
        this.children = children;
    }

    private final String localName;
    public getLocalName(String localName) {
        this.localName = localName;
    }

    private final Unknown mode;
    public getMode(Unknown mode) {
        this.mode = mode;
    }

    private final String namespaceURI;
    public getNamespaceURI(String namespaceURI) {
        this.namespaceURI = namespaceURI;
    }

    private final String nodeValue;
    public getNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    private final Unknown shadowRoot;
    public getShadowRoot(Unknown shadowRoot) {
        this.shadowRoot = shadowRoot;
    }

}