package core_java_practice.scenario_based;

import java.util.*;

public class ParagraphAnalyzer {
	public static void analyzeParagraph(String s, String oldWord, String newWord) {
		//Check for empty string. If empty return
		if (s == null || s.length() == 0) {
			System.out.println("Empty Paragraph");
			return;
		}

		int words = 0;
		int maxLen = 0;
		int n = s.length();
		String longestWord = "";
		
		//For current word
		StringBuilder current = new StringBuilder();
		
		//For updated Sentence
		StringBuilder updated = new StringBuilder();

		
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				current.append(ch);
			} else {
				if (current.length() > 0) {
					words++;
				}
				if (current.length() > maxLen) {
					maxLen = current.length();
					longestWord = current.toString();
				}
				
				// To make sure that both are equal case-insensitively
				String tempStr = current.toString().toLowerCase();
				String tempStr2 = oldWord.toLowerCase();
				
				if (tempStr.equals(tempStr2)) {
					updated.append(newWord);
				} else {
					updated.append(current);
				}
				updated.append(" ");
				current.setLength(0);
			}
		}
		
		if(current.length() > 0) {
			// to update with the final word
			updated.append(current);
		}
		
		System.out.println("Word Count: " + words);
		System.out.println("Longest Word: " + longestWord);
		System.out.println("Updated Sentence:");
		System.out.println(updated.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String oldWord = sc.next();
		String newWord = sc.next();
		analyzeParagraph(text, oldWord, newWord);
	}

}
