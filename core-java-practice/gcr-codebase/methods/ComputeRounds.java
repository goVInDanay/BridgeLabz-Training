package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class ComputeRounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of the triangle");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		ComputeRounds obj = new ComputeRounds();
		double rounds = obj.computeRounds(side1, side2, side3);
		System.out.println(rounds + " Rounds needed for a 5 km run");
	}
	private double computeRounds(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return 5 / perimeter;
	}

}