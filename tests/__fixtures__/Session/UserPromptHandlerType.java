/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

/**
 * Represents UserPromptHandlerType in WebDriver BiDi protocol
 * as enum of "accept" / "dismiss" / "ignore"
 */
public enum UserPromptHandlerType {
    ACCEPT("accept");
    DISMISS("dismiss");
    IGNORE("ignore");

    private final String value;

    UserPromptHandlerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static UserPromptHandlerType fromString(String text) {
        for (UserPromptHandlerType userprompthandlertype : UserPromptHandlerType.values()) {
            if (userprompthandlertype.value.equalsIgnoreCase(text)) {
                return userprompthandlertype;
            }
        }
        throw new IllegalArgumentException("No UserPromptHandlerType with value: " + text);
    }
}