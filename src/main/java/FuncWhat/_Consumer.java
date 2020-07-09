package FuncWhat;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
       //OLD
        Customer customer1 = new Customer("No3InGame", "Forza is Trash", 20, "88005553535");
        Customer customer2 = new Customer("OnlyNaps", "Forza is Trash", 24, "209834759823");
        //greetCustomer(customer1);

        //Funcy boy
        //greetConsCust.accept(customer1);

        showPhoneNumber.accept(customer1, true);
        showPhoneNumber.accept(customer2, false);
    }


    static BiConsumer <Customer, Boolean> showPhoneNumber = (customer, aBoolean) -> System.out.println("Hello, " + customer.firstName + " "
            + customer.secondName + " in the age of "
            + customer.age + " with a phone number of "
            + (aBoolean ? customer.phoneNumber: "some numbers"));


    static void greetCustomer(Customer customer){
        System.out.println("Hello, " + customer.firstName + " "
                + customer.secondName + " in the age of "
                + customer.age + " with a phone number of "
        + customer.phoneNumber);
    }

    static Consumer<Customer> greetConsCust = customer -> System.out.println("Hello, " + customer.firstName + " "
            + customer.secondName + " in the age of "
            + customer.age + " with a phone number of "
            + customer.phoneNumber);

    static class Customer{
        private final String firstName;
        private final String secondName;
        private final int age;
        private final String phoneNumber;


        public Customer(String firstName, String secondName, int age, String phoneNumber) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.phoneNumber = phoneNumber;
        }
    }
}
