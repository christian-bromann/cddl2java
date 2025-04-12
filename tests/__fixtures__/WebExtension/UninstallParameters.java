package org.openqa.selenium.bidirectional.WebExtension;


public class UninstallParameters {

    public UninstallParameters(WebExtension.Extension extension) {
        this.extension = WebExtension.Extension;
        
    }

    private final WebExtension.Extension extension;
    public getExtension(WebExtension.Extension extension) {
        this.extension = extension;
    }

}