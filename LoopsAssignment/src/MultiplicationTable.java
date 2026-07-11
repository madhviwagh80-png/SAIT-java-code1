
public class MultiplicationTable {
	    public static void main(String[] args) {
	        // Create a Scanner object to read user input
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        System.out.println("Multiplication Table of " + num + ":");
	        
	        // Loop from 1 to 10 to print the table
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " * " + i + " = " + (num * i));
	        }
	        
	        sc.close();
	   }
}

