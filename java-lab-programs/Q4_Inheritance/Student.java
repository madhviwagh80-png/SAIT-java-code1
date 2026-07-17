// Q4. Student Details Using Inheritance

import java.util.Scanner;

class Student {
    int roll;
    String name;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}
