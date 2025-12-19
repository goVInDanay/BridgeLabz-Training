import java.util.*;
public class FindBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary and years of service");
		double salary = sc.nextDouble();
		int years = sc.nextInt();
		double bonus = 0.0;
		if(years > 5) {
			bonus = salary * (5.0/100);
		}
		System.out.println("You are eligible for " + bonus + " bonus amount");
	}	

}
