import java.util.*;
public class UserSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		String []userWords = userSplit(s);
		String []words = s.split(" ");
		System.out.println("User split function -> ");
		for(int i = 0; i < userWords.length; i++) {
			System.out.println(userWords[i]);
		}
		System.out.println("Method split -> ");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
	private static String[] userSplit(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		count++;
		String words[] = new String[count];
		int idx[] = new int[count];
		int x = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				idx[x++] = i;
			}
		}
		idx[x++] = s.length();
		int last = 0;
		for(int i = 0; i < count; i++) {
			words[i] = s.substring(last, idx[i]);
			last = idx[i] + 1;
		}
		return words;
	}

}
