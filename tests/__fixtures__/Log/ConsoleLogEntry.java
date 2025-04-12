package org.openqa.selenium.bidirectional.Log;


public class ConsoleLogEntry {

    public ConsoleLogEntry(String method) {
        this.method = String;
        this.type = "console";
        this.args = "Unknown[]";
    }

    private final console type;
    public getType(console type) {
        this.type = type;
    }

    private final String method;
    public getMethod(String method) {
        this.method = method;
    }

    private final Unknown[] args;
    public getArgs(Unknown[] args) {
        this.args = args;
    }

}