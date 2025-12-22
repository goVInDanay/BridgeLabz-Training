import java.util.*;
public class UserUpperCase {
	private static boolean userEquals(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
		return true;
	}
	private static String userUpperCase(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				sb.append((char)(s.charAt(i) - 32));
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =  sc.nextLine();
		String userString = userUpperCase(s);
		String methodString = s.toUpperCase();
		boolean equal = userEquals(userString, methodString);
		System.out.println("User UpperCase method String -> " + userString + " Method UpperCase String -> " + methodString + " are equal ? " + equal);
	}

}
