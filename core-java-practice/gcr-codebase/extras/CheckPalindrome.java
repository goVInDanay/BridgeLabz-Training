package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		boolean ans = isPalindrom(s);
		display(ans);
	}
	public static boolean isPalindrom(String s) {
		int n = s.length();
		for(int i = 0; i <= n / 2; i++) {
			if(s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}
	public static void display(boolean result) {
		if(result) {
			System.out.println("The given string is a palindrome");
			return;
		}
		System.out.println("The given string is not a palindrome");
	}

}
