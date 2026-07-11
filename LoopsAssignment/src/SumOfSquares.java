
public class SumOfSquares {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        // Loop from 1 to N
        for (int i = 1; i <= n; i++) {
            // Square the current number and add it to the sum
            sum = sum + (i * i);
        }
        
        System.out.println("The sum of squares of first " + n + " natural numbers is: " + sum);
        
        sc.close();
    }
}