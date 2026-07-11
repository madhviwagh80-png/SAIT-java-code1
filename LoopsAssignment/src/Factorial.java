
public class Factorial {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        long factorial = 1;
        
        
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i; 
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        sc.close();
    }
}