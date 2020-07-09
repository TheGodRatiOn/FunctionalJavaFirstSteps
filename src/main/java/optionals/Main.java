package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("null")
                .ifPresentOrElse(value -> System.out.println("what are you doing here, " + value + " ?"),
                        () -> System.out.println("I can't find you"));
                //.orElseThrow(() -> new IllegalStateException("Wrong value exception; Not Null"));
        ;
    }
}
