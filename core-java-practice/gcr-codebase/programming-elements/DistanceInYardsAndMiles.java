import java.util.Scanner;
public class DistanceInYardsAndMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in feet");
		double feet = sc.nextDouble();
		double yards = feet / 3;
		double mile = yards / 1760;
		System.out.println("The distance in yards is " + yards + " while the distance in miles is " + mile);
	}

}
