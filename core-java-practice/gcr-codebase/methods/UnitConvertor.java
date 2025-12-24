package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class UnitConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double miles = sc.nextDouble();
		double meters = sc.nextDouble();
		double feet = sc.nextDouble();
		double km2Miles = convertKmToMiles(km);
		double miles2km = convertMilesToKm(miles);
		double meters2feet = convertMetersToFeet(meters);
		double feet2meters = convertFeetToMeters(feet);
		System.out.println("Miles " + km2Miles + " Km " + miles2km + " Feet " + meters2feet + " Meters " + feet2meters);
	}
	public static double convertKmToMiles(double km) {
		double km2Miles = km * 0.621371;
		return km2Miles;
	}
	
	public static double convertMilesToKm(double miles) {
		double miles2km = 1.60934 * miles;
		return miles2km;
	}
	public static double convertMetersToFeet(double meters) {
		double meters2feet = 3.28084 * meters;
		return meters2feet;
	}
	public static double convertFeetToMeters(double feet) {
		double feet2meters = 0.3048 * feet;
		return feet2meters;
	}
}
