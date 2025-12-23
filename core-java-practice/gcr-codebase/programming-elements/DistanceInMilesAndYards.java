import java.util.*;
public class DistanceInMilesAndYards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in feet");
		double feet = sc.nextDouble();
		double yards = feet / 3;
		double mile = yards / 1760;
		System.out.println("Distance in feet is " + feet + " and in miles is " + mile + " and in yards is " + yards);
	}

}
