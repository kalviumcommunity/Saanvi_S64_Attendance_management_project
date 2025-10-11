package com.school;

public class Person {
    private static int nextIdCounter = 1;
    private int id;
    private String name;

    // Constructor
    public Person(String name) {
        this.id = nextIdCounter++;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Display details method
    public void displayDetails() {
        System.out.println("Person ID: " + this.id + ", Name: " + this.name);
    }
}
