// Program 2
// Question: Write a Java program to calculate the addition of two numbers using prototyping of methods.

public class Program2 {
    // Method definition (prototype)
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        int result = add(a, b); // Method call
        System.out.println("Addition result: " + result);
    }
}

/*
Output:
Addition result: 60
*/
