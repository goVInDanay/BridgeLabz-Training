import java.util.*;
public class AgeAndHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of 3 friends");
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		System.out.println("Enter height of 3 friends");
		double height1 = sc.nextDouble();
		double height2 = sc.nextDouble();
		double height3 = sc.nextDouble();
		String youngest = "";
		String tallest = "";
		if(age1 < age2 && age1 < age3) {
			youngest = "Amar";
		}
		else if(age2 < age3 && age2 < age1) {
			youngest = "Akbar";
		}
		else {
			youngest = "Anthony";
		}
		if(height1 > height2 && height1 > height3) {
			tallest = "Amar";
		}
		else if(height2 > height3 && height2 > height1) {
			tallest = "Akbar";
		}
		else {
			tallest = "Anthony";
		}
		System.out.println("Youngest " + youngest + " Tallest " + tallest);
	}

}
