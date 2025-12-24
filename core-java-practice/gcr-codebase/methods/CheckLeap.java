package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CheckLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String isLeap = isLeapYear(year);
		System.out.println(isLeap);
	}
	private static String isLeapYear(int year) {
		if(year < 1582) {
			return "Not Leap";
		}
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return "Leap";
		}
		return "Not Leap";
	}

}
