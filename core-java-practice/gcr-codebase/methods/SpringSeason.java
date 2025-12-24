package core_java_practice.gcr_codebase.methods;
import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		SpringSeason ss = new SpringSeason();
		ss.isSpring(date, month);
	}	
	private void isSpring(int date, int month) {
		if((month == 3 && date >= 20) || month == 4 || month == 5 || (month == 6 && date <= 20)) {
			System.out.println("Its a spring season");
		}
		else {
			System.out.println("Its not a spring season");
		}
	}

}
