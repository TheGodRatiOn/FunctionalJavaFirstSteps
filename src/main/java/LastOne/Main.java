package LastOne;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("greddy", "295", value -> System.out.println("Second Name not provided, " + value));

        hello2("greddy", null, () -> System.out.println("Second Name not provided"));
    }

    static void hello(String firstName, String secondName, Consumer<String> callback){
        System.out.println(firstName);
        if (secondName != null){
            System.out.println(secondName);
        }else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String secondName, Runnable callback){
        System.out.println(firstName);
        if (secondName != null){
            System.out.println(secondName);
        }else {
            callback.run();
        }
    }
}
