package org.openqa.selenium.bidirectional.Network;


public class RemoveInterceptParameters {

    public RemoveInterceptParameters(Network.Intercept intercept) {
        this.intercept = Network.Intercept;
        
    }

    private final Network.Intercept intercept;
    public getIntercept(Network.Intercept intercept) {
        this.intercept = intercept;
    }

}