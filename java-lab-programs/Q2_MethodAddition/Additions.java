// Q2. Addition of two Numbers Using Method

import java.util.Scanner;

class Additions {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + add(a, b));
    }
}

/*
Output
Enter first number: 25
Enter second number: 15
Sum = 40
*/
