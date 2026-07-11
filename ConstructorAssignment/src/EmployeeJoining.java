
public class EmployeeJoining {
    private String name;
    private String department;

    // Instance initializer block
    {
        System.out.println("Employee Registration Started");
    }

    // No-argument constructor
    public EmployeeJoining() {
        // Chains to the constructor with one parameter
        this("Unknown");
    }

    // Constructor accepting employee name
    public EmployeeJoining(String name) {
        // Chains to the constructor with two parameters
        this(name, "Not Assigned");
    }

    // Constructor accepting employee name and department
    public EmployeeJoining(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        // Simulating the example output with "Raj" and "IT"
        EmployeeJoining emp = new EmployeeJoining("Raj", "IT");
        emp.displayDetails();
    }
}