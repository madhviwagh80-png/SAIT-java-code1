// Program 7
// Question: Write a Java program to demonstrate implementation of an interface which contains two
// method declarations: Square and Cube.

interface MathOperations {
    void square(int num);
    void cube(int num);
}

class Calculator implements MathOperations {
    public void square(int num) {
        System.out.println("Square of " + num + " is: " + (num * num));
    }

    public void cube(int num) {
        System.out.println("Cube of " + num + " is: " + (num * num * num));
    }
}

public class Program7 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.square(5);
        calc.cube(5);
    }
}

/*
Output:
Square of 5 is: 25
Cube of 5 is: 125
*/
