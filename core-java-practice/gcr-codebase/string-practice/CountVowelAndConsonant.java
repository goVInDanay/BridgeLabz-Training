import java.util.*;
public class CountVowelAndConsonant {
	static char vowels[] = {'a', 'e', 'i', 'o', 'u'};
	static char consonants[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count[] = findCount(s);
		System.out.println("Count of consonants " + count[0] + " Count of vowels " + count[1] + " Count of Not Letters " + count[2]);
	}
	private static int[] findCount(String s) {
		int cons = 0;
		int vowel = 0;
		int none = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 65 && ch <= 90) {
				ch = (char)(ch + 32);
			}
			boolean flag = true;
			for(int j = 0; j < vowels.length; j++) {
				if(vowels[j] == ch) {
					vowel++;
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int j = 0; j < consonants.length; j++) {
					if(consonants[j] == ch) {
						cons++;
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				none++;
			}
		}
		return new int[] {cons, vowel, none};
	}

}
