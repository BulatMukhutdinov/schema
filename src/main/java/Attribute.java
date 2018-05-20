import com.sun.istack.internal.Nullable;
import lombok.Builder;
import lombok.NonNull;

@Builder
public class Attribute {

    @NonNull
    public final InputType inputType;

    @Nullable
    public final String allowedSymbols;

    @Nullable
    public final String regex;

    public final int minLength;

    public final int maxLength;
}