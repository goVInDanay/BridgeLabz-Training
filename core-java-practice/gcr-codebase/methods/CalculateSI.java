package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CalculateSI {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		int time = sc.nextInt();
		CalculateSI obj = new CalculateSI();
		double si = obj.calculateSI(principal, rate, time);
		System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
	private double calculateSI(double principal, double rate, int time) {
		double si = (principal * rate * time) / 100;
		return si;
	}
}