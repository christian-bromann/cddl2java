/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

/**
 * Represents ResultOwnership in WebDriver BiDi protocol
 * as enum of "root" / "none"
 */
public enum ResultOwnership {
    ROOT("root");
    NONE("none");

    private final String value;

    ResultOwnership(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ResultOwnership fromString(String text) {
        for (ResultOwnership resultownership : ResultOwnership.values()) {
            if (resultownership.value.equalsIgnoreCase(text)) {
                return resultownership;
            }
        }
        throw new IllegalArgumentException("No ResultOwnership with value: " + text);
    }
}