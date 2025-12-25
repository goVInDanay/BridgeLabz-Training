package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = removeDuplicates(s);
		System.out.println("Without duplicates : " + ans);
	}
	public static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		int freq[] = new int[26];
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a'] = 1;
		}
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(freq[ch - 'a'] == 1) {
				sb.append(ch);
				freq[ch - 'a']--;
			}
		}
		return sb.toString();
	}
}
