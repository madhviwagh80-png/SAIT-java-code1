
public class IfElseIfEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age :");
		int age = sc.nextInt();
	         
		    if(age>0 && age<=4) {
				System.out.println("You're a Infant");
			}else if(age>4 && age<=12) {
				System.out.println("You're a Child ");
			}else if(age>12 && age<=19) {
				System.out.println("You're a Teen");
			}else if(age>19 && age<=50) {
				System.out.println("You're a Adult");
			}else if(age>50 && age<=80) {
				System.out.println("You're old");
			}else {
				System.out.println("Soon to Death!!");
			}
		System.out.println("Thank You");
	}
}
