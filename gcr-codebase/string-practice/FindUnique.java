import java.util.*;
public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ans[] = findUnique(s);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
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
}
