package Bai1;

import java.util.ArrayList;
import java.util.List;

enum Gender {
    MALE, FEMALE
}

public class Person {
    private String name;
    private String dateOfBirth;
    private Gender gender;
    private Person spouse;
    private List<Person> children;
    private int generation; 

    public Person(String name, String dob, Gender gender, int generation) {
        this.name = name;
        this.dateOfBirth = dob;
        this.gender = gender;
        this.spouse = null;
        this.children = new ArrayList<>();
        this.generation = generation;
    }


    public void marry(Person newSpouse) {
        spouse = newSpouse;
        newSpouse.spouse = this;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Person getSpouse() {
        return spouse;
    }

    public List<Person> getChildren() {
        return children;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String toString() {
        return "Name: " + getName() + ", D.O.B: " + getDateOfBirth() + ", Gender: " + getGender();
    }
}

