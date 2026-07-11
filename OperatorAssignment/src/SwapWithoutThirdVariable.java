
public class SwapWithoutThirdVariable {
	   public static void main(String[] args) {
	        // Step 1: Initialize two numbers
	        int a = 10;
	        int b = 20;

	        System.out.println("--- Before Swapping ---");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Step 2: Swap using math (+ and -)
	        a = a + b;  // a now becomes 30 (10 + 20)
	        b = a - b;  // b now becomes 10 (30 - 20)
	        a = a - b;  // a now becomes 20 (30 - 10)

	        System.out.println("\n--- After Swapping ---");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	}
}
