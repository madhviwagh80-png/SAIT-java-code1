
public class FahrenheitToCelcius {
	public static void main(String[] args) {
		int fahrenheit = 66;
		
		//C = (F-32)*5/9
		double celcius = ((fahrenheit - 32 )*5.0) / 9.0;
		
		System.out.println("Fahrenheit : "+fahrenheit+ " F");
		System.out.println("Celcius : "+celcius+ " C");
	}

}