import java.util.*;
public class CheckIsSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date and month in integers");
		int date = sc.nextInt();
		int month = sc.nextInt();
		if((month == 3 && date >= 20) || month == 4 || month == 5 || (month == 6 && date <= 20)) {
			System.out.println("Its a spring season");
		}
		else {
			System.out.println("Its not a spring season");
		}
	}	

}
