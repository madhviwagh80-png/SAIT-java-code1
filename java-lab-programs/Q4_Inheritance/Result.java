// Q4. Student Details Using Inheritance (continued)

import java.util.Scanner;

class Result extends Student {
    int marks;

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String args[]) {
        Result obj = new Result();
        obj.getData();
        obj.getMarks();
        obj.display();
    }
}

/*
Output
Enter Roll No: 0873AL241018
Enter Name: Madhvi
Enter Marks: 92

Student Details
Roll No: 0873AL241018
Name: Madhvi
Marks: 92
*/
