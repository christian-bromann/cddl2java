package org.openqa.selenium.bidirectional.Network;


public class BeforeRequestSentParameters {

    public BeforeRequestSentParameters(Network.Initiator initiator) {
        this.initiator = Network.Initiator;
        
    }

    private final Network.Initiator initiator;
    public getInitiator(Network.Initiator initiator) {
        this.initiator = initiator;
    }

}