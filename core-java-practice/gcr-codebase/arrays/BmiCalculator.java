import java.util.*;
public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double height[] = new double[n];
		double weight[] = new double[n];
		double []bmi = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter client weight and then height");
			weight[i] = sc.nextDouble();
			height[i] = sc.nextDouble();
			if(weight[i] < 0 || height[i] < 1) {
				System.err.println("Enter valid input");
				i--;
				continue;
			}
			height[i] = height[i] / 100;
		}
		for(int i = 0; i < n; i++) {
			bmi[i] = weight[i] / (height[i] * height[i]);
		}
		for(int i = 0; i < n; i++) {
			if(bmi[i] <= 18.4) {
				System.out.println("Client is Underweight");
			}
			else if(bmi[i] >= 18.5 && bmi[i] <= 24.9) {
				System.out.println("Client is Normal");
			}
			else if(bmi[i] >= 25 && bmi[i] <= 39.9) {
				System.out.println("Client is Overweight");
			}
			else {
				System.out.println("CLient is Obese");
			}
		}
	}

}
