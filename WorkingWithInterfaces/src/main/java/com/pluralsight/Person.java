package com.pluralsight;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // required compareTo method since Person implements Comparable interface
    @Override
    public int compareTo(Person otherPerson) {

        // if last name equals another person's last name it compares their first names
        if (getLastName().equals(otherPerson.getLastName())) {
            return this.getFirstName().compareToIgnoreCase(otherPerson.getFirstName());
        } // else if first and last name equals another person's first and last name it compares by their ages
        else if (getFirstName().equals(otherPerson.firstName) && getLastName().equals(otherPerson.getLastName())) {
            return Integer.compare(this.getAge(), otherPerson.getAge());
        }
        // if there are no matches it compares by their last names
        return this.getLastName().compareToIgnoreCase(otherPerson.getLastName());
    }
}
