
public class MobilePhoneInventory {
    private String brand;
    private String model;
    private double price;

    // Instance initializer block
    {
        System.out.println("Inventory Entry Started");
        this.brand = "Samsung"; // Assigns default brand
    }

    // Default constructor creating a basic phone
    public MobilePhoneInventory() {
        // Chains to the constructor with one parameter
        this("Basic Model");
    }

    // Parameterized constructor accepting model
    public MobilePhoneInventory(String model) {
        // Chains to the constructor with two parameters
        this(model, 0.0);
    }

    // Constructor accepting model and price
    public MobilePhoneInventory(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        
        // Formats balance cleanly as an integer if it has no decimals
        if (this.price % 1 == 0) {
            System.out.println("Price: " + (int) this.price);
        } else {
            System.out.println("Price: " + this.price);
        }
    }

    public static void main(String[] args) {
        // Simulating the example output with "S24" and 65000
        MobilePhoneInventory phone = new MobilePhoneInventory("S24", 65000);
        phone.displayDetails();
    }
}
