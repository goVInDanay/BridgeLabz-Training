package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class UnitConvertor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double yards = sc.nextDouble();
		double feet = sc.nextDouble();
		double meters = sc.nextDouble();
		double inches = sc.nextDouble();
		double yards2feet = convertYardsToFeet(yards);
		double feet2yards = convertFeetToYards(feet);
		double meters2inches = convertMetersToInches(meters);
		double inches2meters = convertInchesToMeters(feet);
		double inches2cm = convertInchesToCentimeters(inches);
		System.out.println("Feet " + yards2feet + " Yards " + feet2yards + " Inches " + meters2inches + " Meters " + inches2meters + " Centimeters " + inches2cm);
	}
	public static double convertYardsToFeet(double yards) {
		double yards2feet = 3 * yards;
		return yards2feet;
	}
	
	public static double convertFeetToYards(double feet) {
		double feet2yards = 0.333333 * feet;
		return feet2yards;
	}
	public static double convertMetersToInches(double meters) {
		double meters2inches = 39.3701;
		return meters2inches;
	}
	public static double convertInchesToMeters(double inches) {
		double inches2meters = 0.0254;
		return inches2meters;
	}
	public static double convertInchesToCentimeters(double inches) {
		double inches2cm = 2.54 * inches;
		return inches2cm;
	}
}
