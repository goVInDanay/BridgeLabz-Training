package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Is Palindrome? " + (isPalindrome(s) ? "Yes" : "No"));
	}
	public static boolean isPalindrome(String s) {
		int n = s.length();
		for(int i = 0; i <= s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
