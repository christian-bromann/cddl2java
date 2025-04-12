package org.openqa.selenium.bidirectional.Network;


public class AddInterceptResult {

    public AddInterceptResult(Network.Intercept intercept) {
        this.intercept = Network.Intercept;
        
    }

    private final Network.Intercept intercept;
    public getIntercept(Network.Intercept intercept) {
        this.intercept = intercept;
    }

}