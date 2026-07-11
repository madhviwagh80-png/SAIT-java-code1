
class A{
	int x;
	void m() {
		System.out.println("Hey A");
	}
}
public class ClassObjectQues1 {
	public static void main(String[] args) {
		A a=new A();
		a.x=10;
		a.m();
		A b=new A();
		b.x=2;
		System.out.println(a.x);
		System.out.println(b.x);
	}
}