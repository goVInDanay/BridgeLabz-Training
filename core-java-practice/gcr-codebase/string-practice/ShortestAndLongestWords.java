import java.util.Scanner;
public class ShortestAndLongestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		String [][]userWordsLength = userWordsAndLength(s);
		int shortestAndLongestWordIdx[] = findShortestAndLongestWord(userWordsLength);
		System.out.println("Shortest word " + userWordsLength[shortestAndLongestWordIdx[0]][0] + " Longest word " + userWordsLength[shortestAndLongestWordIdx[1]][0]);
	}
	private static int[] findShortestAndLongestWord(String[][] userWordsLength) {
		int shortest = Integer.MAX_VALUE;
		int shortestIdx = 0;
		int longest = 0;
		int longestIdx = 0;
		for(int i = 0; i < userWordsLength.length; i++) {
			int length = Integer.parseInt(userWordsLength[i][1]);
			if(length < shortest) {
				shortest = length;
				shortestIdx = i;
			}
			if(length > longest) {
				longest = length;
				longestIdx = i;
			}
		}
		return new int[]{shortestIdx, longestIdx};
	}
	private static int userLength(String s) {
		int length = 0;
		try {
			while(true) {
				s.charAt(length);
				length++;
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			return length;
		}
	}
	private static String[][] userWordsAndLength(String s){
		String words[] = userSplit(s);
		int len = words.length;
		String wordAndLen[][] = new String[len][2];
		for(int i = 0; i < len; i++) {
			int length = userLength(words[i]);
			wordAndLen[i][0] = words[i];
			wordAndLen[i][1] = String.valueOf(length);
		}
		return wordAndLen;
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
