// Q12. WAP to Demonstrate Exception Handling

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero is not allowed.");
        }

        System.out.println("Program Ended.");
    }
}

/*
Output
Enter first number: 20
Enter second number: 4
Result = 5
Program Ended.
*/
