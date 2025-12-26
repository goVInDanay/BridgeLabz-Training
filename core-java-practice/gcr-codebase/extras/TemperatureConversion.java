package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		double celsius = sc.nextDouble();
		double farhenheit = convertCelsiusToFarhenheit(celsius);
		double reCelsius = convertFarhenheitToCelsius(farhenheit);
		System.out.println("Temperature in Celsius " + celsius + " converted to Farhenheit " + farhenheit + " reconverted to Celsius " + celsius);
	}
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	
	public static double convertCelsiusToFarhenheit(double celsius) {
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
}
