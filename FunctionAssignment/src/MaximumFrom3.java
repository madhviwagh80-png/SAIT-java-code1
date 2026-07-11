
public class MaximumFrom3 {
	
	    public static int max3(int a, int b, int c) {
	        if (a >= b && a >= c) {
	            return a;
	        } else if (b >= a && b >= c) {
	            return b;
	        } else {
	            return c;
	        }
	    }

	    public static void main(String[] args) {
	        int num1 = 12;
	        int num2 = 25;
	        int num3 = 45;

	        int largest = max3(num1, num2, num3);
	        System.out.println("The largest number is: " + largest);
	    }
}

