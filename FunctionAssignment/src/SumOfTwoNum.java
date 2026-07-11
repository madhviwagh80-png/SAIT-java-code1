
public class SumOfTwoNum {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SumOfTwoNum assignment = new SumOfTwoNum();

        int num1 = 30;
        int num2 = 20;

        // Call the sum method
        int result = assignment.sum(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}