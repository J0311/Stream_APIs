package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Object value =
        Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        Object value2 =
                Optional.ofNullable("Hello")
                        .orElseGet(() -> "default value");

         Supplier<IllegalStateException> exception = ()
                 -> new IllegalStateException("exception");
//                Optional.ofNullable(null)
//                        .orElseThrow(() -> new IllegalStateException("exception"));

        System.out.println(value2);
    }
}
