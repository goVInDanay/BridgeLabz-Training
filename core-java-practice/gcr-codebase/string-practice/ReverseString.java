package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = reverseString(s);
		System.out.println("String " + s + " Reverse " + rev);
	}
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
