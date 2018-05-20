import com.sun.istack.internal.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;

@AllArgsConstructor
public class Schema {

    public final Entry attributes[];

    @Builder
    class Entry {
        @NonNull
        public final String name;

        @Nullable
        public final String hint;

        @NonNull
        public final Attribute attribute;
    }
}