package combinator;

import java.time.LocalDate;

public class Customer {
    private final String firstName;
    private final String secondName;
    private final String phoneNumber;
    private final LocalDate dob;
    private final String email;

    public Customer(String firstName, String secondName, String phoneNumber, LocalDate dob, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }
}