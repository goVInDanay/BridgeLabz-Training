import java.util.*;
public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = findFirstNonRepeating(s);
		if(ch == ' ') {
			System.out.println("No non-repeating character");
		}
		else {
			System.out.println(ch);
		}
	}
    public static char findFirstNonRepeating(String s) {
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
