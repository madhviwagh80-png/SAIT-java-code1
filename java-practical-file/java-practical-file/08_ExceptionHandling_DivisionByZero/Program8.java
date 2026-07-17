// Program 8
// Question: Write a Java program to demonstrate the concept of exception handling in case of a division
// by zero error.

public class Program8 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot divide a number by zero!");
        } finally {
            System.out.println("Execution of try-catch block completed.");
        }
    }
}

/*
Output:
Exception Caught: Cannot divide a number by zero!
Execution of try-catch block completed.
*/
