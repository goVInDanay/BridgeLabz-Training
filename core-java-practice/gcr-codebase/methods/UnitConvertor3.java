package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class UnitConvertor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double farhenheit = sc.nextDouble();
		double celsius = sc.nextDouble();
		double pounds = sc.nextDouble();
		double kilograms = sc.nextDouble();
		double gallons = sc.nextDouble();
		double liters = sc.nextDouble();
		double farhenheit2celcius = convertFarhenheitToCelsius(farhenheit);
		double celsius2farhenheit = convertCelsiusToFarhenheit(celsius);
		double pounds2kilograms = convertPoundsToKilograms(pounds);
		double kilograms2pounds = convertKilogramsToPounds(kilograms);
		double gallons2liters = convertGallonsToLiters(gallons);
		double liters2gallons = convertLitersToGallons(liters);
		System.out.println("Celsius " + celsius2farhenheit + " Farhenheit " + farhenheit2celcius + " Kilograms " + pounds2kilograms + " Pounds " + kilograms2pounds + " Liters " + gallons2liters + " Gallons " + liters2gallons);
	}
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	
	public static double convertCelsiusToFarhenheit(double celsius) {
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double convertPoundsToKilograms(double pounds) {
		double pounds2kilograms = 0.453592 * pounds;
		return pounds2kilograms;
	}
	public static double convertKilogramsToPounds(double kilograms) {
		double kilograms2pounds = 2.20462 * kilograms; 
		return kilograms2pounds;
	}
	public static double convertGallonsToLiters(double gallons) {
		double gallons2liters = 0.264172 * gallons; 
		return gallons2liters;
	}
	public static double convertLitersToGallons(double liters) {
		double liters2gallons = 3.78541 * liters; 
		return liters2gallons;
	}
	
}
