package LastOne;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("lol kek");
            return name.toUpperCase() + " " + age;
        };

        System.out.println(upperCaseName.apply("Alex", 56));
    }
}