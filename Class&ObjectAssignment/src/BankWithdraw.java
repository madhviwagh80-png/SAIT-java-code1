
class BankAccount {
    // Private variables (Encapsulation)
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    // Constructor to initialize variables
    public BankAccount(String accountHolder, double balance, double withdrawAmount) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    // Getter logic to check withdrawal and calculate remaining balance
    public double getRemainingBalance() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount; // Subtract from balance
        } else {
            System.out.println("Status         : Insufficient balance");
        }
        return balance;
    }

    // Method to display account transaction summary
    public void displayAccountSummary() {
        System.out.println("----- Bank Statement -----");
        System.out.println("Account Holder : " + getAccountHolder());
        System.out.println("Requested Cash : $" + getWithdrawAmount());
        
        // This triggers the getter logic and updates the balance if valid
        double remaining = getRemainingBalance(); 
        
        System.out.println("Current Balance: $" + remaining);
        System.out.println("--------------------------\n");
    }
}

// Main class to test the implementation
public class BankWithdraw {
    public static void main(String[] args) {
        // Test Case 1: Valid Withdrawal (Amount <= Balance)
        BankAccount account1 = new BankAccount("Alice", 1000.0, 300.0);
        account1.displayAccountSummary();

        // Test Case 2: Invalid Withdrawal (Amount > Balance)
        BankAccount account2 = new BankAccount("Bob", 500.0, 600.0);
        account2.displayAccountSummary();
    }
}