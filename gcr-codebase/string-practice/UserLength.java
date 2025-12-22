import java.util.*;
public class UserLength {
	private static int userLength(String s) {
		int length = 0;
		try {
			while(true) {
				s.charAt(length);
				length++;
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Found length of string");
			return length;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int userLen = userLength(s);
		int len = s.length();
		System.out.println("User length is -> " + userLen + " and method length is -> " + len);
	}

}
