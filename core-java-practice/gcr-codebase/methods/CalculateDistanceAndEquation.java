package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CalculateDistanceAndEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distance = calculateDistance(x1, y1, x2, y2);
		double eq[] = getEquation(x1, y1, x2, y2);
		String equation = "y = " + eq[0] + " * x + " + eq[1]; 
		System.out.println("Distance " + distance);
		System.out.println("Equation " + equation);
	}
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2)) + Math.sqrt(Math.pow(y2 - y1, 2));
	}
	public static double[] getEquation(double x1, double y1, double x2, double y2) {
		double slope = (y2 - y1) / (x2 - x1);
		double b = y1 - slope * x1;
		return new double[] {slope, b};
	}

}
