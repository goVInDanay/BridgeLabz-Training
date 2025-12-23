import java.util.*;
public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans[][] = findFrequency(s);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(((char)ans[i][0]) + " " + ans[i][1]);
		}
	}
    public static int[][] findFrequency(String s) {
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int count = 0;
        for(int i : freq) {
        	if(i > 0) {
        		count++;
        	}
        }

        int[][] ans = new int[count][2];
        int idx = 0;
        for(int i = 0; i < 256; i++) {
            if(freq[i] > 0) {
                ans[idx][0] = i;
                ans[idx][1] = freq[i];
                idx++;
            }
        }
        return ans;
    }
}
