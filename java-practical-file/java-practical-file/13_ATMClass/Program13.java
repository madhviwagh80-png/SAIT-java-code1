// Program 13
// Question: Create a class ATM that manages a user's balance with PIN verification.

class ATM {
    private double balance = 5000.00;
    private final int correctPin = 1234;

    void checkBalance(int enteredPin) {
        if (enteredPin == correctPin) {
            System.out.println("Verification Successful! Your balance is: Rs. " + balance);
        } else {
            System.out.println("Error: Incorrect PIN. Access Denied.");
        }
    }
}

public class Program13 {
    public static void main(String[] args) {
        ATM myAtm = new ATM();
        System.out.println("Attempt 1:");
        myAtm.checkBalance(0000);
        System.out.println("\nAttempt 2:");
        myAtm.checkBalance(1234);
    }
}

/*
Output:
Attempt 1:
Error: Incorrect PIN. Access Denied.

Attempt 2:
Verification Successful! Your balance is: Rs. 5000.0
*/
