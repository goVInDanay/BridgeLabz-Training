package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String oldSub = sc.next();
		String newSub = sc.next();
		System.out.println("New Word " + replaceWord(s, oldSub, newSub));
	}
	public static String replaceWord(String s, String oldSub, String newSub) {
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		int n = s.length();
		while(idx < n) {
			if(idx + oldSub.length() <= n && s.substring(idx, idx + oldSub.length()).equals(oldSub)) {
				sb.append(newSub);
				idx += oldSub.length();
			}
			else {
				sb.append(s.charAt(idx));
				idx++;
			}
		}
		return sb.toString();
	}

}
