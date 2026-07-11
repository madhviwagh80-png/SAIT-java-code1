
public class CircleArea {
	public static void main(String[] args) {
		double radius = 5.0;
		double pi = 3.14;
		
		//Area
		double Area = pi * radius * radius;
		
		//Circumference
		double Circumference = 2 * pi * radius;
		
		System.out.println("Radius : "+radius+ "cm");
		System.out.println("Area of circle is : "+Area+ "sq cm");
		System.out.println("Circumference of circle is : "+Circumference+ "cm");
	}

}
