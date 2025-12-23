import java.util.Scanner;
public class FindUniqueFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] data = findCharacterFrequency(s);
        displayFrequency(data);
	}
    public static char[] findUnique(String s) {
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] == 1) {
                count++;
            }
        }
        char[] ans = new char[count];
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] == 1) {
                ans[idx++] = s.charAt(i);
            }
        }
        return ans;
    }
    public static String[][] findCharacterFrequency(String s) {
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char[] uniqueChars = findUnique(s);
        String[][] ans = new String[uniqueChars.length][2];
        for(int i = 0; i < uniqueChars.length; i++) {
            ans[i][0] = String.valueOf(uniqueChars[i]);
            ans[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return ans;
    }
    public static void displayFrequency(String[][] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

}
