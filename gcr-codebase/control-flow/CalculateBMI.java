import java.util.*;
public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height and height");
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		height = height / 100;
		double bmi = weight / (height * height);
		if(bmi <= 18.4) {
			System.out.println("Underweight");
		}
		else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal");
		}
		else if(bmi >= 25 && bmi <= 39.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}

}
