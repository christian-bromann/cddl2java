/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

package org.openqa.selenium.bidirectional.browsingcontext;

import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.bidi.Command;
import org.openqa.selenium.bidirectional.EmptyResult;

/**
 * Auto generated class for running WebDriver BiDi browsingcontext commands in Java
 */
public class BrowsingContextModule {

    /**
     * WebDriver Bidi command to send command method "browsingContext.traverseHistory" with parameters.
     * @url https://w3c.github.io/webdriver-bidi/#command-browsingContext-traverseHistory
     * @param parameters `TraverseHistoryParameters` {@link https://w3c.github.io/webdriver-bidi/#command-browsingContext-traverseHistory | command parameter}
     * @return Command object with result type for browsingContext.traverseHistory
     */
    public Command<TraverseHistoryResult> TraverseHistory (TraverseHistoryParameters parameters) {
        return new Command<>(
            "browsingContext.traverseHistory",
            parameters.asMap(),
            TraverseHistoryResult.class
        );
    }
}