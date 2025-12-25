package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.println("After removing character " + removeCharacter(s, ch));
	}
	public static String removeCharacter(String s, char ch) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char chars = s.charAt(i);
			if(chars != ch) {
				sb.append(chars);
			}
		}
		return sb.toString();
	}
}
