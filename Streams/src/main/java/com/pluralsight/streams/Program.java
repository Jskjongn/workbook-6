package com.pluralsight.streams;

import java.util.*;

public class Program {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // new list of type person called people
        ArrayList<Person> people = new ArrayList<>();

        // adds a new person to people list
        people.add(new Person("Finn", "Mertens", 17));          // Main human boy
        people.add(new Person("Jake", "the Dog", 30));          // Magic dog
        people.add(new Person("Princess", "Bubblegum", 827));   // Candy kingdom ruler
        people.add(new Person("Marceline", "Abadeer", 1003));   // Vampire Queen
        people.add(new Person("Simon", "Petrikov", 1000));      // Ice King
        people.add(new Person("BMO", "Robot", 5));              // Sentient game console
        people.add(new Person("Lumpy", "Space Princess", 18));  // LSP
        people.add(new Person("Flame", "Princess", 16));        // Fire Kingdom royalty
        people.add(new Person("Earl", "of Lemongrab", 30));     // Lemongrab
        people.add(new Person("Peppermint", "Butler", 300));    // Dark magic butler

        // prompts user for first or last name and stores it
        System.out.print("Would you like to search by First or Last name? ");
        String choice = userInput.nextLine();

        // if user input equals first or first name
        if (choice.equalsIgnoreCase("first") || choice.equalsIgnoreCase("first name")) {

            // creates a list of first names and puts the person objects into the stream
            List<String> firstNames = people.stream()
                    // gets the first name of each person object and returns a String
                    .map(person -> person.getFirstName())
                    // adds all the first names into a list from the stream
                    .toList();
            // displays each first name
            firstNames.forEach(name -> System.out.println(name));

        // else if user input equals last or last name
        } else if (choice.equalsIgnoreCase("last") || choice.equalsIgnoreCase("last name")) {

            // creates a list of last names and puts the person objects into the stream
            List<String> lastNames = people.stream()
                    // for each person object and returns a last name String
                    .map(Person::getLastName)
                    // adds all the last names into a list from the stream
                    .toList();
            // for each last name displays last name
            lastNames.forEach(System.out::println);
        }

        System.out.println("-------------------------------------------------------------");

        // creates a list of person objects and starts the stream
        OptionalDouble averageAge = people.stream()
                // for each person get their age and return age as an int
                .mapToInt(person -> person.getAge())
                // averages of int values
                .average();
        // displays average age and gets age as an actual double
        System.out.println("Average age: " + averageAge.getAsDouble());

        System.out.println("-------------------------------------------------------------");

        OptionalInt oldest = people.stream()
                .mapToInt(person -> person.getAge())
                // compares and returns the largest int
                .reduce(Math::max);
        // displays oldest age and gets the oldest age as an actual int
        System.out.println("Oldest age: " + oldest.getAsInt());

        System.out.println("-------------------------------------------------------------");

        OptionalInt youngest = people.stream()
                .mapToInt(Person::getAge)
                // compares and returns the smallest int
                .reduce(Math::min);
        // displays youngest age and gets the youngest age as an actual int
        System.out.println("Youngest age: " + youngest.getAsInt());
    }
}
