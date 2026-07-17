// Program 3
// Question: Write a Java program to demonstrate function overloading for calculation of average.

public class Program3 {
    // Average of two numbers
    public static double calculateAverage(double a, double b) {
        return (a + b) / 2;
    }

    // Overloaded method: Average of three numbers
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Average of 2 numbers (10, 20): " + calculateAverage(10, 20));
        System.out.println("Average of 3 numbers (10, 20, 30): " + calculateAverage(10, 20, 30));
    }
}

/*
Output:
Average of 2 numbers (10, 20): 15.0
Average of 3 numbers (10, 20, 30): 20.0
*/
