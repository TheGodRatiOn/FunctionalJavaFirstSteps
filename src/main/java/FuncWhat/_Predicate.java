package FuncWhat;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("OLD");
        System.out.println(isPhoneValid("88005535353"));
        System.out.println(isPhoneValid("68005535353"));
        System.out.println(isPhoneValid("8800553535"));

        System.out.println("NEW");
        System.out.println(isPhoneNumber.test("88005535353"));
        System.out.println(isPhoneNumber.test("68005535353"));
        System.out.println(isPhoneNumber.test("8800553535"));

        System.out.println(isPhoneNumber.or(contains4).test("68005535353"));
    }

    static boolean isPhoneValid(String somePhoneNumber){
        return somePhoneNumber.startsWith("8") && somePhoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumber = somePhoneNumber -> somePhoneNumber.startsWith("8") && somePhoneNumber.length() == 11;

    static Predicate<String> contains4 = phoneNumber -> phoneNumber.contains("5");
}
