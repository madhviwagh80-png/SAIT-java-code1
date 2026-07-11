
public class UserRegistration {
    private String username;
    private String userType;

    // Instance initializer block
    {
        System.out.println("Registration Process Started");
    }

    // Default constructor assigning guest details
    public UserRegistration() {
        // Chaining to the parameterized constructor
        this("Guest");
        this.userType = "Guest User";
    }

    // Parameterized constructor accepting username
    public UserRegistration(String username) {
        this.username = username;
        this.userType = "Registered User";
    }

    // Method to display account creation status
    public void displayStatus() {
        System.out.println("Username: " + this.username);
        System.out.println("Account Created Successfully");
    }

    public static void main(String[] args) {
        // Simulating the example output with "Rahul"
        UserRegistration user = new UserRegistration("Rahul");
        user.displayStatus();
    }
}