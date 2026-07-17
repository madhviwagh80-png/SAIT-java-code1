// Program 16
// Question: Create a class Employee that calculates Gross salary from a Basic salary.

class Employee {
    double basicSalary;

    Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    double calculateGrossSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.20 * basicSalary;
        return basicSalary + hra + da;
    }
}

public class Program16 {
    public static void main(String[] args) {
        Employee emp = new Employee(30000);
        System.out.println("Basic Salary: Rs. " + emp.basicSalary);
        System.out.println("Calculated Gross Salary: Rs. " + emp.calculateGrossSalary());
    }
}

/*
Output:
Basic Salary: Rs. 30000.0
Calculated Gross Salary: Rs. 39000.0
*/
