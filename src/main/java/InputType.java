import lombok.Getter;

public enum InputType {
    NONE(0), // There is no content type. The text is not editable.
    TEXT(1), // Just plain old text
    NUMBER(2), // A numeric only field
    PHONE (3), // For entering a phone number
    DATETIME (4), // For entering a date and time
    DATE (5) , // For entering a date
    NUMBER_DECIMAL (6), // A decimal (fractional) number
    NUMBER_SIGNED (7), // A signed number
    TEXT_MULTILINE (8), //  Multiple lines of text in the field. If this flag is not set, the text field will be constrained to a single line
    TIME (9); // For entering a time

    @Getter
    private int index;

    InputType(int index) {
        this.index = index;
    }
}
