package org.openqa.selenium.bidirectional.network;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class NetworkModule {

    /**
     * WebDriver Bidi command to send command method "network.setCacheBehavior" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-network-setCacheBehavior
     * @param params `NetworkSetCacheBehaviorParameters` {@link https://w3c.github.io/webdriver-bidi/#command-network-setCacheBehavior | command parameter}
     */
    public Command<EmptyResult> SetCacheBehavior (SetCacheBehaviorParameters parameters) {
        return new Command<>(
            "network.setCacheBehavior",
            parameters.asMap(),
            EmptyResult.class
        );
    }
}