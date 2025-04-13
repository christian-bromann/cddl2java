/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

/**
 * Represents UserPromptType in WebDriver BiDi protocol
 * as enum of "alert" / "beforeunload" / "confirm" / "prompt"
 */
public class UserPromptType {
    ALERT("alert");
    BEFOREUNLOAD("beforeunload");
    CONFIRM("confirm");
    PROMPT("prompt");

    private final String value;

    UserPromptType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static UserPromptType fromString(String text) {
        for (UserPromptType userprompttype : UserPromptType.values()) {
            if (userprompttype.value.equalsIgnoreCase(text)) {
                return userprompttype;
            }
        }
        throw new IllegalArgumentException("No UserPromptType with value: " + text);
    }
}