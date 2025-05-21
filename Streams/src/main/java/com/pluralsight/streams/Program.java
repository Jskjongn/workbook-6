package com.pluralsight.streams;

import java.util.*;

public class Program {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

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

        System.out.print("Would you like to search by First or Last name? ");
        String choice = userInput.nextLine();

        if (choice.equalsIgnoreCase("first") || choice.equalsIgnoreCase("first name")) {

            List<String> firstNames = people.stream()
                    .map(person -> person.getFirstName())
                    .toList();
            firstNames.forEach(name -> System.out.println(name));

        } else if (choice.equalsIgnoreCase("last") || choice.equalsIgnoreCase("last name")) {

            List<String> lastNames = people.stream()
                    .map(person -> person.getLastName())
                    .toList();
            lastNames.forEach(name -> System.out.println(name));
        }

        System.out.println("-------------------------------------------------------------");

        OptionalDouble averageAge = people.stream()
                .mapToInt(person -> person.getAge())
                .average();

        System.out.println("Average age: " + (int) averageAge.getAsDouble());

        System.out.println("-------------------------------------------------------------");

        OptionalInt oldest = people.stream()
                .mapToInt(person -> person.getAge())
                .reduce(Math::max);

        System.out.println("Oldest age: " + oldest.getAsInt());

        System.out.println("-------------------------------------------------------------");

        OptionalInt youngest = people.stream()
                .mapToInt(person -> person.getAge())
                .reduce(Math::min);

        System.out.println("Youngest age: " + youngest.getAsInt());
    }
}
