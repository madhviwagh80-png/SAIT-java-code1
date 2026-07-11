
public class MaximumNum {
	
	    public static int max(int a, int b) {
	        if (a > b) {
	            return a;
	        } else {
	            return b;
	        }
	    }

	    public static void main(String[] args) {
	        int num1 = 15;
	        int num2 = 25;

	        int greater = max(num1, num2);
	        System.out.println("The greater number is: " + greater);
	    }
}

