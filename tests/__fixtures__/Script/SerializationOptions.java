package org.openqa.selenium.bidirectional.Script;


public class SerializationOptions {

    public SerializationOptions(Unknown maxDomDepth, Unknown maxObjectDepth, Unknown includeShadowTree) {
        this.maxDomDepth = Unknown;
        this.maxObjectDepth = Unknown;
        this.includeShadowTree = Unknown;
        
    }

    private final Unknown maxDomDepth;
    public getMaxDomDepth(Unknown maxDomDepth) {
        this.maxDomDepth = maxDomDepth;
    }

    private final Unknown maxObjectDepth;
    public getMaxObjectDepth(Unknown maxObjectDepth) {
        this.maxObjectDepth = maxObjectDepth;
    }

    private final Unknown includeShadowTree;
    public getIncludeShadowTree(Unknown includeShadowTree) {
        this.includeShadowTree = includeShadowTree;
    }

}