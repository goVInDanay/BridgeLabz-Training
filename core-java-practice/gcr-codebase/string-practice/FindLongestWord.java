package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class FindLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String longestWord = findLongestWord(s);
		System.out.println("Longest Word: " + longestWord);
	}
	public static String findLongestWord(String s) {
		s = s.trim();
		int count = 1;
		int n = s.length();
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		String words[] = new String[count];
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				words[idx++] = sb.toString();
				sb.setLength(0);
			}
			else {
				sb.append(ch);
			}
		}
		words[idx++] = sb.toString();
		String longestWord = "";
		for(String word : words) {
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}

}
