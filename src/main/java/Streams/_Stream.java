package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Astolfo", "rofl", 16, Gender.TRAP),
                new Person("OnlyNaps", "MaskedTulip1350", 24, Gender.MALE),
                new Person("Attacker", "2", 140, Gender.FEMALE),
                new Person("Jessie", "Rodrigues", 19, Gender.FEMALE),
                new Person("Michelle", "Rodrigues", 22, Gender.FEMALE),
                new Person("Jessie", "Clapton", 63, Gender.FEMALE),
                new Person("John", "Rodrigues", 24, Gender.MALE)
        );

        people.stream()
                .map(person -> person.firstName)
                .mapToInt(String::length)
                //.collect(Collectors.toSet())
                .forEach(System.out::println);
        people.stream().close();

        boolean onlyMans =  people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(onlyMans);

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
