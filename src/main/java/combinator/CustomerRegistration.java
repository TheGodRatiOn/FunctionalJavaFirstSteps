package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistration extends Function<Customer, CustomerRegistration.ValidationResult> {

    static CustomerRegistration isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }


    static CustomerRegistration isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    static CustomerRegistration isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("8") && customer.getPhoneNumber().length() == 11? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    default CustomerRegistration and(CustomerRegistration other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
