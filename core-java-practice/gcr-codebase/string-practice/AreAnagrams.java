package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class AreAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("Are Anagrams? " + areAnagrams(s1, s2));
	}
	public static boolean areAnagrams(String s1, String s2) {
		int n = s1.length();
		if(n != s2.length()) {
			return false;
		}
		int freq[] = new int[26];
		for(int i = 0; i < n; i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			freq[ch1 - 'a']++;
			freq[ch2 - 'a']--;
		}
		for(int i = 0; i < 26; i++) {
			if(freq[i] > 0) {
				return false;
			}
		}
		return true;
	}
}
