import java.util.Scanner;
public class DisplayCountOfVowelAndConsonants {
	static char vowels[] = {'a', 'e', 'i', 'o', 'u'};
	static char consonants[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String letterType[][] = findType(s);
		display(letterType);
	}
	private static void display(String [][]arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
	private static String findLetter(char ch) {
		if(ch >= 65 && ch <= 90) {
			ch = (char)(ch + 32);
		}
		for(int j = 0; j < vowels.length; j++) {
			if(vowels[j] == ch) {
				return "Vowel";
			}
		}
		for(int j = 0; j < consonants.length; j++) {
			if(consonants[j] == ch) {
				return "Consonant";
			}
		}
		return "Not a Letter";
	}
	private static String[][] findType(String s) {
		String letterType[][] = new String[s.length()][2];
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			letterType[i][0] = "" + ch;
			letterType[i][1] = findLetter(ch);
		}
		return letterType;
	}

}
