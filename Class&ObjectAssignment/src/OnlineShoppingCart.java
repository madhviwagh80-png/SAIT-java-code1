
class ShoppingCart {
    // Private variables (Encapsulation)
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize variables
    public ShoppingCart(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Getter logic to calculate total cost with conditional discount
    public double getTotalCost() {
        double total = quantity * price;
        
        // If total cost is greater than 5000, apply a 10% discount
        if (total > 5000) {
            total -= total * 0.10; // Deducts 10% discount
        }
        
        return total;
    }

    // Method to print the product name and final payable amount
    public void printFinalPayableAmount() {
        System.out.println("Product Name         : " + getProductName());
        System.out.println("Final Payable Amount : $" + getTotalCost());
        System.out.println("----------------------------------------");
    }
}

// Main class to test the implementation
public class OnlineShoppingCart{
    public static void main(String[] args) {
        System.out.println("----- Shopping Cart Receipt -----\n");
        
        // Test Case 1: Total <= 5000 (No Discount)
        ShoppingCart cart1 = new ShoppingCart("Smartphone", 1200.0, 3);
        cart1.printFinalPayableAmount();

        // Test Case 2: Total > 5000 (10% Discount Applied)
        ShoppingCart cart2 = new ShoppingCart("Laptop", 1500.0, 4);
        cart2.printFinalPayableAmount();
    }
}