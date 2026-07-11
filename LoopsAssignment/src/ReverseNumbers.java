
public class ReverseNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reverse = 0;
        
        // Loop runs until the number becomes 0
        while (num != 0) {
            int remainder = num % 10;        // Extract the last digit
            reverse = reverse * 10 + remainder; // Append it to the reversed number
            num = num / 10;                  // Remove the last digit from original number
        }
        
        System.out.println("Reversed Number: " + reverse);
        
        sc.close();
    }
}