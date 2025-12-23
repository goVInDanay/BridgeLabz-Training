import java.util.Scanner;
public class UserKilometerToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in km");
		double km = sc.nextDouble();
		double miles = km / 1.6;
		System.out.println("The total miles is " + miles + " mile for given " + km + " km");
	}

}
