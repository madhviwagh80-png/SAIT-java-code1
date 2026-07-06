
class ElectricityBill {
    // Private variables (Encapsulation)
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    // Constructor to initialize variables
    public ElectricityBill(String customerName, int unitsConsumed, double pricePerUnit) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.pricePerUnit = pricePerUnit;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Getter logic to calculate and return the total bill
    public double getTotalBill() {
        double totalBill = unitsConsumed * pricePerUnit;
        
        // If units are greater than 500, add a 10% surcharge
        if (unitsConsumed > 500) {
            totalBill += totalBill * 0.10; // Adds 10% surcharge
        }
        
        return totalBill;
    }

    // Method to display the final bill details
    public void displayBill() {
        System.out.println("----- Electricity Bill -----");
        System.out.println("Customer Name  : " + getCustomerName());
        System.out.println("Units Consumed : " + getUnitsConsumed());
        System.out.println("Price Per Unit : $" + getPricePerUnit());
        System.out.println("Surcharge (10%): " + (getUnitsConsumed() > 500 ? "Applied" : "Not Applied"));
        System.out.println("Total Amount   : $" + getTotalBill());
        System.out.println("----------------------------\n");
    }
}

// Main class to test the implementation
public class ElectricityBillSystem {
    public static void main(String[] args) {
        // Test Case 1: Units <= 500 (No Surcharge)
        ElectricityBill bill1 = new ElectricityBill("John Doe", 350, 0.12);
        bill1.displayBill();

        // Test Case 2: Units > 500 (10% Surcharge Applied)
        ElectricityBill bill2 = new ElectricityBill("Jane Smith", 600, 0.12);
        bill2.displayBill();
    }
}