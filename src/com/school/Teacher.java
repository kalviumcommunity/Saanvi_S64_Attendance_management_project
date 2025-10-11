package com.school;

public class Teacher extends Person {
    private String subjectTaught;

    // Constructor
    public Teacher(String name, String subjectTaught) {
        super(name); // Call parent constructor
        this.subjectTaught = subjectTaught;
    }

    // Getter for subject taught
    public String getSubjectTaught() {
        return subjectTaught;
    }

    // Override display details to add teacher-specific info
    @Override
    public void displayDetails() {
        System.out.println("Teacher ID: " + this.getId() + ", Name: " + this.getName() + 
                          ", Subject Taught: " + this.subjectTaught);
    }
}
