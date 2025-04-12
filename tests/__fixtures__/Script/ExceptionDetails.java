package org.openqa.selenium.bidirectional.Script;


public class ExceptionDetails {

    public ExceptionDetails(long columnNumber, Script.RemoteValue exception, long lineNumber, Script.StackTrace stackTrace, String text) {
        this.columnNumber = long;
        this.exception = Script.RemoteValue;
        this.lineNumber = long;
        this.stackTrace = Script.StackTrace;
        this.text = String;
        
    }

    private final long columnNumber;
    public getColumnNumber(long columnNumber) {
        this.columnNumber = columnNumber;
    }

    private final Script.RemoteValue exception;
    public getException(Script.RemoteValue exception) {
        this.exception = exception;
    }

    private final long lineNumber;
    public getLineNumber(long lineNumber) {
        this.lineNumber = lineNumber;
    }

    private final Script.StackTrace stackTrace;
    public getStackTrace(Script.StackTrace stackTrace) {
        this.stackTrace = stackTrace;
    }

    private final String text;
    public getText(String text) {
        this.text = text;
    }

}