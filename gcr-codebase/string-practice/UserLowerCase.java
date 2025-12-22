import java.util.Scanner;
public class UserLowerCase {
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
	private static String userLowerCase(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 92) {
				sb.append((char)(s.charAt(i) + 32));
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
		String userString = userLowerCase(s);
		String methodString = s.toLowerCase();
		boolean equal = userEquals(userString, methodString);
		System.out.println("User LowerCase method String -> " + userString + " Method LowerCase String -> " + methodString + " are equal ? " + equal);
	}

}
