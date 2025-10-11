package com.school;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Create students with grade levels
        Student student1 = new Student("Alice", "Grade 10");
        Student student2 = new Student("Bob", "Grade 11");

        // Create teachers
        Teacher teacher1 = new Teacher("Ms. Johnson", "Mathematics");
        Teacher teacher2 = new Teacher("Mr. Smith", "Science");

        // Create staff members
        Staff staff1 = new Staff("Mrs. Davis", "Administrator");
        Staff staff2 = new Staff("Mr. Wilson", "Janitor");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Display students
        System.out.println("=== Students ===");
        student1.displayDetails();
        student2.displayDetails();

        // Display teachers
        System.out.println("\n=== Teachers ===");
        teacher1.displayDetails();
        teacher2.displayDetails();

        // Display staff
        System.out.println("\n=== Staff ===");
        staff1.displayDetails();
        staff2.displayDetails();

        // Display courses
        System.out.println("\n=== Courses ===");
        course1.displayDetails();
        course2.displayDetails();

        // Attendance Log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add attendance records using inherited getId() method
        attendanceLog.add(new AttendanceRecord(student1.getId(), course1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getId(), course2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(student1.getId(), course2.getCourseId(), "Late")); // invalid

        // Display attendance
        System.out.println("\n=== Attendance Records ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // Demonstrate polymorphism - all Person objects can be stored in a Person array
        // System.out.println("\n=== Polymorphism Demo ===");
        Person[] people = {student1, student2, teacher1, teacher2, staff1, staff2};
        for (Person person : people) {
            person.displayDetails(); // Each calls its own overridden version
        }
    }
}