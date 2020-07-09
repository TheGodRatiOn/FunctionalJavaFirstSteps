package FuncWhat;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(getDBConnectionURL());

        System.out.println();
        System.out.println(getDBConnectionURLSup.get());
    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:8080/users";
    }

    static Supplier<List<String>> getDBConnectionURLSup = ()
            -> List.of("jdbc://localhost:8080/users", "jdbc://localhost:6094/users");
}
