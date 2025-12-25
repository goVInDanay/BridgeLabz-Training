package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class MostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char mostFreq = mostFrequentCharacter(s);
		System.out.println("Most Frequent Character " + mostFreq);
	}
	public static char mostFrequentCharacter(String s) {
		int freq[] = new int[26];
		int n = s.length();
		for(int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}
		int frequency = 0;
		char mostFrequent = ' ';
		for(int i = 0; i < 26; i++) {
			if(freq[i] > frequency) {
				mostFrequent = (char)(i + 'a');
				frequency = freq[i];
			}
		}
		return mostFrequent;
	}
}
