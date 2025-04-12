package org.openqa.selenium.bidirectional.Script;


public class StackFrame {

    public StackFrame(long columnNumber, String functionName, long lineNumber, String url) {
        this.columnNumber = long;
        this.functionName = String;
        this.lineNumber = long;
        this.url = String;
        
    }

    private final long columnNumber;
    public getColumnNumber(long columnNumber) {
        this.columnNumber = columnNumber;
    }

    private final String functionName;
    public getFunctionName(String functionName) {
        this.functionName = functionName;
    }

    private final long lineNumber;
    public getLineNumber(long lineNumber) {
        this.lineNumber = lineNumber;
    }

    private final String url;
    public getUrl(String url) {
        this.url = url;
    }

}