package core_java_practice.scenario_based;

import java.util.*;

public class FlipKey {

	public static String cleanseAndInvert(String input) {
		if (input == null || input.length() < 6) {
			return "";
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')) {
				return "";
			}
		}
		input = input.toLowerCase();
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch % 2 == 0) {
				continue;
			}
			password.append(ch);
		}
		password.reverse();
		for (int i = 0; i < password.length(); i++) {
			if (i % 2 == 0) {
				char ch = password.charAt(i);
				password.deleteCharAt(i);
				password.insert(i, (char) (ch - 32));
			}
		}
		return password.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = sc.nextLine();
		String password = cleanseAndInvert(input);
		if (password.length() > 0) {
			System.out.println("The generated key is - " + password);
		} else {
			System.out.println("Invalid Input");
		}
	}

}
