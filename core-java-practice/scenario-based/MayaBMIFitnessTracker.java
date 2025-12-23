import java.util.*;
public class MayaBMIFitnessTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter exit to exit. Else type anything and press enter");
			String input = sc.next();
			input = input.trim();			// so that extra spaces may be removed
			input = input.toLowerCase();	// so that even if user enter Exit he may exit
			if(input.equals("exit")) {	
				System.out.println("Exiting");
				break;
			}
			System.out.println("Enter height of client (int cm)");
			double height = sc.nextDouble();
			height = height / 100;			// to convert height from cm to m
			System.out.println("Enter weight of client");
			double weight = sc.nextDouble();
			double bmi = weight / (height * height);
			System.out.println("BMI is " + bmi + " kg /m^2");
			if(bmi <= 18.4) {
				System.out.println("Client is Underweight");
			}
			else if(bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("Client is Normal");
			}
			else if(bmi >= 25 && bmi <= 39.9) {
				System.out.println("Client is Overweight");
			}
			else {
				System.out.println("CLient is Obese");
			}
		}
	}

}
