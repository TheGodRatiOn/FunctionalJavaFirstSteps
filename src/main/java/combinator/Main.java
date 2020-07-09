package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistration.isEmailValid;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Greddy", "295", "80238578637", LocalDate.of(1994, 8, 3), "greddygtr@mail.com");

        //System.out.println(new CustomerValidatorService().isValid(customer));

        //Storeable in DB;

        //the great combinator

        CustomerRegistration.ValidationResult result = isEmailValid()
                .and(CustomerRegistration.isPhoneNumberValid())
                .and(CustomerRegistration.isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistration.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
