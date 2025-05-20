package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonApp {

    public static void main(String[] args) {

        // creates list and adds persons to list
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Bart", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Zephaniah", "Hughes", 47) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        // sorts the list of persons from the Person's overridden compareTo method
        Collections.sort(myFamily);

        // loops for each person inside the list to display in order
        for (Person person : myFamily) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
        }
    }
}
