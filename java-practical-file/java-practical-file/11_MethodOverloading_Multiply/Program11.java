// Program 11
// Question: Write a Java program to demonstrate the concept of method overloading.

public class Program11 {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Program11 obj = new Program11();
        System.out.println("Multiplication of 2 numbers: " + obj.multiply(5, 4));
        System.out.println("Multiplication of 3 numbers: " + obj.multiply(5, 4, 2));
    }
}

/*
Output:
Multiplication of 2 numbers: 20
Multiplication of 3 numbers: 40
*/
