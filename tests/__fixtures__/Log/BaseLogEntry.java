package org.openqa.selenium.bidirectional.Log;


public class BaseLogEntry {

    public BaseLogEntry(Log.Level level, Script.Source source, Unknown text, long timestamp, Script.StackTrace stackTrace) {
        this.level = Log.Level;
        this.source = Script.Source;
        this.text = Unknown;
        this.timestamp = long;
        this.stackTrace = Script.StackTrace;
        
    }

    private final Log.Level level;
    public getLevel(Log.Level level) {
        this.level = level;
    }

    private final Script.Source source;
    public getSource(Script.Source source) {
        this.source = source;
    }

    private final Unknown text;
    public getText(Unknown text) {
        this.text = text;
    }

    private final long timestamp;
    public getTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private final Script.StackTrace stackTrace;
    public getStackTrace(Script.StackTrace stackTrace) {
        this.stackTrace = stackTrace;
    }

}