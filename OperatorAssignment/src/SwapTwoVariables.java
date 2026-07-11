
public class SwapTwoVariables {
	public static void main(String[] args) {
		int a = 2006;
		int b = 10;
		
		System.out.println("----Before Swaping----");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("----After Swaping----");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
