package JustYes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main{

public static void main(String[]args){
        List<Person> people = List.of(
                new Person("Astolfo", "rofl", 16, Gender.TRAP),
         //       new Person("OnlyNaps", "MaskedTulip1350", 24, Gender.MALE),
                new Person("Attacker", "2", 140, Gender.FEMALE),
                new Person("Jessie", "Rodrigues", 19, Gender.FEMALE),
                new Person("Michelle", "Rodrigues", 22, Gender.FEMALE),
                new Person("Jessie", "Clapton", 63, Gender.FEMALE),
                new Person("John", "Rodrigues", 24, Gender.MALE)
        );
        
        //KEKW
        
        List<Person> females = new ArrayList<>();

        System.out.println("BRUHMOMENT");
        System.out.println();

        for ( Person person: people) {
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for ( Person female: females) {
            System.out.println(female.toString());
        }

        //Billy approach
        System.out.println("EZ Clap");
        System.out.println();


    Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);


    List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
}

    static class Person{
        private final String firstName;
        private final String secondName;
        private final int age;
        private final Gender gender;

        Person(String firstName, String secondName, int age, Gender gender){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {MALE, FEMALE, TRAP}
}
