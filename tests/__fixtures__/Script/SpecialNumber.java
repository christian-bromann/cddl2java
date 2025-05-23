/**
 * !!! PLEASE DO NOT EDIT THIS FILE !!!
 *
 * This source file, even though checked in, is auto-generated based on the
 * current development within the WebDriver Bidi spec. Any changes to this
 * file need to come from the specification.
 */

/**
 * Represents SpecialNumber in WebDriver BiDi protocol
 * as enum of "NaN" / "-0" / "Infinity" / "-Infinity"
 */
public enum SpecialNumber {
    NAN("NaN");
    NEGATIVE_0("-0");
    INFINITY("Infinity");
    NEGATIVE_INFINITY("-Infinity");

    private final String value;

    SpecialNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SpecialNumber fromString(String text) {
        for (SpecialNumber specialnumber : SpecialNumber.values()) {
            if (specialnumber.value.equalsIgnoreCase(text)) {
                return specialnumber;
            }
        }
        throw new IllegalArgumentException("No SpecialNumber with value: " + text);
    }
}