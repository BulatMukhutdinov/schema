public class ExampleUsage {

    public void build() {
        InputType textType = InputType.TEXT;
        InputType phoneType = InputType.PHONE;

        Attribute name = Attribute.builder()
                .inputType(textType)
                .allowedSymbols("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
                .minLength(1)
                .maxLength(50)
                .build();

        Attribute phone = Attribute.builder()
                .inputType(phoneType)
                .minLength(8)
                .maxLength(20)
                .build();

        Attribute email = Attribute.builder()
                .inputType(textType)
                .regex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$")
                .minLength(3)
                .maxLength(100)
                .build();

        Schema personalInfo = new Schema(new Schema.Entry[]{
                Schema.Entry.builder()
                        .name("First name")
                        .hint("Please input your first name as in 'First name' filed in your passport")
                        .attribute(name)
                        .build(),

                Schema.Entry.builder()
                        .name("Last name")
                        .hint("Please input your last name as in 'Last name' filed in your passport")
                        .attribute(name)
                        .build(),

                Schema.Entry.builder()
                        .name("Phone")
                        .attribute(phone)
                        .build(),

                Schema.Entry.builder()
                        .name("Email")
                        .hint("Please input valid email (need to be verified later)")
                        .attribute(email)
                        .build(),
        });
    }
}
