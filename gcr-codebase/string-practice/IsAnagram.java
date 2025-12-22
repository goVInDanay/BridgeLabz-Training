import java.util.*;
public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean isAnagram = areAnagrams(s1, s2);
        if(isAnagram) {
            System.out.println("The ss are anagrams");
        } 
        else {
            System.out.println("The ss are not anagrams");
        }
	}
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for(int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

}
