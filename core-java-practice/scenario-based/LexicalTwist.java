package core_java_practice.scenario_based;

import java.util.*;

public class LexicalTwist {

	public static boolean isReversed(String s1, String s2) {
		int n = s1.length();
		if (n != s2.length()) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(n - i - 1);
			ch1 = ch1 >= 65 && ch1 <= 90 ? (char) (ch1 + 32) : ch1;
			ch2 = ch2 >= 65 && ch2 <= 90 ? (char) (ch2 + 32) : ch2;
			if (ch1 != ch2) {
				return false;
			}
		}
		return true;
	}

	public static String twistFirst(String s) {
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				ch = (char) (ch + 32);
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				ch = '@';
			}
			reversed += ch;
		}
		return reversed;
	}

	public static String twistBoth(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		String combined = s1 + s2;
		String upper = "";
		int countConsonants = 0;
		int countVowels = 0;
		for (int i = 0; i < combined.length(); i++) {
			char ch = combined.charAt(i);
			if (ch >= 97 && ch <= 122) {
				ch = (char) (ch - 32);
			}
			if (ch >= 'A' && ch <= 'Z') {
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					countVowels++;
				} else {
					countConsonants++;
				}
			}
			upper += ch;
		}
		String ans = "";
		if (countVowels > countConsonants) {
			for (int i = 0; i < upper.length(); i++) {
				char ch = upper.charAt(i);
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					if (ans.indexOf(ch) == -1) {
						ans += ch;
					}
				}
				if (ans.length() == 2) {
					break;
				}
			}
		} else if (countVowels < countConsonants) {
			for (int i = 0; i < upper.length(); i++) {
				char ch = upper.charAt(i);
				if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
					if (ans.indexOf(ch) == -1) {
						ans += ch;
					}
				}
				if (ans.length() == 2) {
					break;
				}
			}
		} else {
			ans = "Vowels and consonants are equal";
		}
		return ans;
	}

	public static void lexicalTwister(String s1, String s2) {
		if (s1.contains(" ")) {
			System.out.println(s1 + " is an invalid word");
			return;
		}
		if (s2.contains(" ")) {
			System.out.println(s2 + " is an invalid word");
			return;
		}
		if (isReversed(s1, s2)) {
			System.out.println(twistFirst(s1));
		} else {
			System.out.println(twistBoth(s1, s2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2");
		String s2 = sc.nextLine();
		lexicalTwister(s1, s2);
	}

}
