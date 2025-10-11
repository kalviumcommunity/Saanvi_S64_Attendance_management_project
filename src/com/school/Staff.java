package com.school;

public class Staff extends Person {
    private String role;

    // Constructor
    public Staff(String name, String role) {
        super(name); // Call parent constructor
        this.role = role;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Override display details to add staff-specific info
    @Override
    public void displayDetails() {
        System.out.println("Staff ID: " + this.getId() + ", Name: " + this.getName() + 
                          ", Role: " + this.role);
    }
}
