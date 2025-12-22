import java.util.*;
public class FindUniqueLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ans = findCharacterFrequency(s);
        for(String str : ans) {
            System.out.println(str);
        }
	}
    public static String[] findCharacterFrequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '0') {
                continue;
            }
            freq[i] = 1;
            for(int j = i + 1; j < chars.length; j++) {
                if(chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != '0') {
                count++;
            }
        }
        String[] ans = new String[count];
        int idx = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != '0') {
                ans[idx++] = chars[i] + " " + freq[i];
            }
        }
        return ans;
    }

}
