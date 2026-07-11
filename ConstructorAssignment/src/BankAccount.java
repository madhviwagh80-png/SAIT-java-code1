
public class BankAccount {
    private String customerName;
    private double balance;
    private String accountType;

    // Instance initializer block
    {
        System.out.println("Account Initialization Started");
        this.accountType = "Savings"; // Default account type
    }

    // Default constructor
    public BankAccount() {
        // Chains to the constructor with one parameter
        this("Unknown");
    }

    // Constructor accepting customer name
    public BankAccount(String customerName) {
        // Chains to the constructor with two parameters
        this(customerName, 0.0);
    }

    // Constructor accepting customer name and balance
    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Customer: " + this.customerName);
        // Display balance formatted cleanly as an integer if it has no decimals
        if (this.balance % 1 == 0) {
            System.out.println("Balance: " + (int) this.balance);
        } else {
            System.out.println("Balance: " + this.balance);
        }
    }

    public static void main(String[] args) {
        // Simulating the example output with "Amit" and 5000
        BankAccount account = new BankAccount("Amit", 5000);
        account.displayDetails();
    }
}