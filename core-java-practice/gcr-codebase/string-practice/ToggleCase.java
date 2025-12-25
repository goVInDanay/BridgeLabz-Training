package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String toggle = toggleCase(s);
		System.out.println("Toggle Case " + toggle);
	}
	public static String toggleCase(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				sb.append((char)(ch - 32));
			}
			else if(ch >= 'A' && ch <= 'Z') {
				sb.append((char)(ch + 32));
			}
			else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
