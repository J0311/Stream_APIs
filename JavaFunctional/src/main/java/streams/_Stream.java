package streams;

import static streams._Stream.Gender.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)

        );
        // Abstracting our Stream API into a variable:
        //Set<Gender> genders =
                people.stream().map(person -> person.gender)
                        /***
                         * .mapToInt(String::length) prints out length of each name
                         */
                .collect(Collectors.toSet())
                        .forEach(System.out::println);// same as ".forEach(gender -> System.out.println());"

    }

    static class Person{

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
