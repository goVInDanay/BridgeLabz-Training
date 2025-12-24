package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CalculateNewSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double data[][] = getDetails(10);
		double newData[][] = calculateBonus(data);
		displayData(data, newData);
	}
	public static double getSalary() {
		return Math.random() * 90000 + 10000;
	}
	public static int getYearsOfService() {
		return (int)(Math.random() * 40) + 1;
	}
	public static double[][] getDetails(int n) {
		double data[][] = new double[n][2];
		for(int i = 0; i < n; i++) {
			data[i][0] = getSalary();
			data[i][1] = getYearsOfService();
		}
		return data;
	}
	public static double[][] calculateBonus(double data[][]){
		double newSalary[][] = new double[data.length][2];
		for(int i = 0; i < data.length; i++) {
			double bonus = 0;
			if(data[i][1] > 5) {
				bonus = data[i][0] * 0.05;
			}
			else {
				bonus = data[i][0] * 0.02;
			}
			newSalary[i][0] = data[i][0] + bonus;
			newSalary[i][1] = bonus;
		}
		return newSalary;
	}
	public static void displayData(double data[][], double newSalary[][]) {
		double oldSalarySum = 0;
		double newSalarySum = 0;
		double totalBonus = 0;
		System.out.println("Emp\tSalary\tYears\tBonus\tNewSalary");
		for(int i = 0; i < data.length; i++) {
			System.out.printf("%d\t%.0f\t%.0f\t%.0f\t%.0f\n", (i + 1), data[i][0], data[i][1], newSalary[i][1], newSalary[i][0]);
			oldSalarySum += data[i][0];
			newSalarySum += newSalary[i][0];
			totalBonus += newSalary[i][1];
		}
		System.out.println("Total Old Salary " + oldSalarySum);
		System.out.println("Total New Salary " + newSalarySum);
		System.out.println("Total Bonus " + totalBonus);
	}
}
