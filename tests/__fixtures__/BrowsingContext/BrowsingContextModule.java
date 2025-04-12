package org.openqa.selenium.bidirectional.browsingcontext;

import org.openqa.selenium.bidi.Command;

/**
 * Auto generated class for running Bidi commands in Java
 */
public class BrowsingContextModule {

    /**
     * WebDriver Bidi command to send command method "browsingContext.traverseHistory" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-browsingContext-traverseHistory
     * @param params `BrowsingContextTraverseHistoryParameters` {@link https://w3c.github.io/webdriver-bidi/#command-browsingContext-traverseHistory | command parameter}
     */
    public Command<TraverseHistoryResult> TraverseHistory (TraverseHistoryParameters parameters) {
        return new Command<>(
            "browsingContext.traverseHistory",
            parameters.asMap(),
            TraverseHistoryResult.class
        );
    }
}