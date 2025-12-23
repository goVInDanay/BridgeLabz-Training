import java.util.*;
public class FindSubstring {
	private static String userSubstring(String s, int startIdx, int endIdx) {
		StringBuilder sb = new StringBuilder();
		for(int i = startIdx; i < endIdx; i++){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int startIdx = sc.nextInt();
		int endIdx = sc.nextInt();
		if(endIdx > s.length() || startIdx < 0 || startIdx > endIdx) {
			System.out.println("Index out of bounds");
			System.exit(endIdx);
		}
		String userSub = userSubstring(s, startIdx, endIdx);
		String substring = s.substring(startIdx, endIdx);
		boolean equal = userEquals(userSub, substring);
		System.out.println("Sub string from charAt is -> " + userSub + " and Sub string from method is -> " + substring + " and they are equal ? " + equal);
	}

}
