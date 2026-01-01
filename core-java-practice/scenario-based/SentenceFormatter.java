package core_java_practice.scenario_based;

import java.util.*;

public class SentenceFormatter {
	private static String stringFormatter(String s) {
		// if string is null or empty it returns an empty string
		if (s.length() == 0 || s.trim().length() == 0) {
			return "";
		}

		// trim extra spaces from start and end
		s = s.trim();
		int n = s.length();

		// stringBuilder for faster processing
		StringBuilder sb = new StringBuilder();

		// to check if next character is capital or not
		boolean capital = true;

		// to check if next character can be a space or not
		boolean space = false;

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				// if character is lowercase and should be uppercase then it changes to
				// uppercase
				if (capital && ch >= 'a' && ch <= 'z') {
					ch = (char) (ch - 32);
				}
				sb.append(ch);
				capital = false;
				space = true;
			} else if (ch == ' ') {
				// if character can be space, add space else skip
				if (space) {
					sb.append(ch);
					space = false;
				}
			} else if (ch == '.' || ch == '?' || ch == '!') {
				// ensure next character that appears after this is capital and not a space
				sb.append(ch);
				sb.append(' ');
				capital = true;
				space = false;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String correctedText = stringFormatter(text);
		System.out.println(correctedText);
	}

}
