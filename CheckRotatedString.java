import java.util.*;
public class CheckRotatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = sc.next();
		System.out.println("Enter String 2");
		String s2 = sc.next();
		if(isRotatedString(s1, s2)) {
			System.out.println("Rotated String");
		}
		else {
			System.out.println("Not a rotated String");
		}
	}
	

	
	
	private static boolean isRotatedString(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		s1 = s1 + s1;
		return s1.contains(s2);
	}

}
