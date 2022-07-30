package imperative;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;


public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)

        );
        System.out.println("IMPERATIVE APPROACH");
        // IMPERATIVE APPROACH - how many females do we have?
        // Create NEW ArrayList called "females"
        // Loop/iterate through our "people" list
        // IF our enum gender FEMALE equals the same gender as our
        // person object, we will add them to "females" ArrayList:

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        // Enhanced for loop to print each female object from
        // our new "females" ArrayList:

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println();
        System.out.println("DECLARATIVE APPROACH");

        // Declarative Approach
        // Our "people" ArrayList invokes stream API method filter
        // We wish to filter any person object that equals the enum "FEMALE"
        // No looping, creating new lists, etc.

/***            TECHNICALLY, we do not need ".collect(Collectors.toList()" because we're filtering the
 *              results, and printing out that data anyway. Therefore, it's been commented out and replaced
 *              with more concise code
 *
 *           people.stream().
                filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList()).forEach(System.out::println); */

        people.stream().
                filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);

        // Instead or printing new list, we can save this Stream code
        // into a separate varialbe as a list, including the Collectors.toList()
        // We now save our filtered list as a new ArrayList entitled "females2":
        System.out.println();
        System.out.println("As a separate list:");
        List<Person> females2 = people.stream().
                filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);


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
