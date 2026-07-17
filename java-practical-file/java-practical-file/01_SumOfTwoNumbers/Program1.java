// Program 1
// Question: Write a Java program that accepts two numbers from the user and prints their sum.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}

/*
Output:
Enter first number: 15
Enter second number: 25
Sum = 40
*/
