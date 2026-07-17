// Program 5
// Question: Write a Java program to show the details of students using the concept of inheritance.

// Base class
class Person {
    String name = "Rahul Sharma";
}

// Derived class extending Person
class Student extends Person {
    int rollNo = 101;
    String branch = "Computer Science";

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

/*
Output:
Student Name: Rahul Sharma
Roll Number: 101
Branch: Computer Science
*/
