
public class DMEx4 {
	public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the year:"
        		+ "");
        int a = sc.nextInt();

        if(a%400==0 || (a%4==0 && a%100!=0)){
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
