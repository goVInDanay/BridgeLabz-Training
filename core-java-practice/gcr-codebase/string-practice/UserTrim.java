import java.util.*;
public class UserTrim {
	private static String userSubstring(String s, int startIdx, int endIdx) {
		StringBuilder sb = new StringBuilder();
		for(int i = startIdx; i < endIdx; i++){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	private static int[] trimIdx(String s) {
		int count = 0;
		int startIdx = 0;
		int endIdx = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				startIdx = count;
				break;
			}
			count++;
		}
		count = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				endIdx = s.length() - count;
				break;
			}
			count++;
		}
		return new int[] {startIdx, endIdx};
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
		String s = sc.nextLine();
		int idx[] = trimIdx(s);
		String trimmedString = userSubstring(s, idx[0], idx[1]);
		String methodString = s.trim();
		boolean equal = userEquals(trimmedString, methodString);
		System.out.println("User trimmed string -> " + trimmedString + " Method trimmed string -> " + methodString + " are equal ? " + equal);
	}

}
