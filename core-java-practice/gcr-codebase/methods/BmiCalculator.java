package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double personalData[][] = new double[10][3];
		for(int i = 0; i < 10; i++) {
			personalData[i][0] = sc.nextDouble();
			personalData[i][1] = sc.nextDouble();
		}
		personalData = calculateBmi(personalData);
		String status[] = bmiStatus(personalData);
		for(String bmi : status) {
			System.out.println(bmi);
		}
	}
	private static double[][] calculateBmi(double personalData[][]){
		int n = personalData.length;
		for(int i = 0; i < n; i++) {
			double bmi = personalData[i][0] / ((personalData[i][1] / 100) * (personalData[i][1] / 100));
			personalData[i][2] = bmi;
		}
		return personalData;
	}
	private static String[] bmiStatus(double personalData[][]) {
		int n = personalData.length;
		String bmiStatus[] = new String[n];
		for(int i = 0; i < n; i++) {
			double bmi = personalData[i][2];
			if(bmi <= 18.4) {
				bmiStatus[i] = "Client is Underweight";
			}
			else if(bmi >= 18.5 && bmi <= 24.9) {
				bmiStatus[i] = "Client is Normal";
			}
			else if(bmi >= 25 && bmi <= 39.9) {
				bmiStatus[i] = "Client is Overweight";
			}
			else {
				bmiStatus[i] ="CLient is Obese";
			}
		}
		return bmiStatus;
	}
}
