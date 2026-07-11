
public class DMEx5{
	public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        if(a<0){
            a = -a;
        }
        System.out.println("absolute value is "+a);
        sc.close();
    }
}