import java.util.Scanner;
public class BmiCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double personData[][] = new double[n][2];
		String weightStatus[] = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter client weight and then height");
			personData[i][0] = sc.nextDouble();
			personData[i][1] = sc.nextDouble();
			if(personData[i][0] < 0 || personData[i][1] < 1) {
				System.err.println("Enter valid input");
				i--;
				continue;
			}
			personData[i][1] = personData[i][1] / 100;
		}
		for(int i = 0; i < n; i++) {
			double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
			if(bmi <= 18.4) {
				weightStatus[i] = "Client is Underweight";
			}
			else if(bmi >= 18.5 && bmi <= 24.9) {
				weightStatus[i] = "Client is Normal";
			}
			else if(bmi >= 25 && bmi <= 39.9) {
				weightStatus[i] = "Client is Overweight";
			}
			else {
				weightStatus[i] ="CLient is Obese";
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(weightStatus[i]);
		}
	}

}
