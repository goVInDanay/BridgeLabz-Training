package collections.gcr_codebase.exception_handling;

import java.util.*;

public class ExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			double amount = sc.nextDouble();
			double rate = sc.nextDouble();
			int years = sc.nextInt();
			System.out.println(calculateInterest(amount, rate, years));
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Invalid Input: " + e.getMessage());
		}
	}

	public static double calculateInterest(double amount, double rate, int years) {
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Amount and rate must be positive");
		}
		return (amount * rate * years) / 100;
	}
}
