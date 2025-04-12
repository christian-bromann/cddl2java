package org.openqa.selenium.bidirectional.Network;


public class Initiator {

    public Initiator(long columnNumber, long lineNumber, Network.Request request, Script.StackTrace stackTrace, Unknown type) {
        this.columnNumber = long;
        this.lineNumber = long;
        this.request = Network.Request;
        this.stackTrace = Script.StackTrace;
        this.type = Unknown;
        
    }

    private final long columnNumber;
    public getColumnNumber(long columnNumber) {
        this.columnNumber = columnNumber;
    }

    private final long lineNumber;
    public getLineNumber(long lineNumber) {
        this.lineNumber = lineNumber;
    }

    private final Network.Request request;
    public getRequest(Network.Request request) {
        this.request = request;
    }

    private final Script.StackTrace stackTrace;
    public getStackTrace(Script.StackTrace stackTrace) {
        this.stackTrace = stackTrace;
    }

    private final Unknown type;
    public getType(Unknown type) {
        this.type = type;
    }

}