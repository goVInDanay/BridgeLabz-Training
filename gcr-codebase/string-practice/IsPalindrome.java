import java.util.*;
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Palindrome Check using Iterative Method: " + isPalindromeI(s));
        System.out.println("Palindrome Check using Recursive Method: " + isPalindromeR(s, 0, s.length() - 1));
        System.out.println("Palindrome Check using Character Arrays: " + isPalindromeA(s));
	}
    public static boolean isPalindromeI(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeR(String s, int start, int end) {
        if(start >= end) {
            return true;
        }
        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeR(s, start + 1, end - 1);
    }
    public static char[] reverseString(String s) {
        char[] rev = new char[s.length()];
        int idx = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev[idx++] = s.charAt(i);
        }
        return rev;
    }
    public static boolean isPalindromeA(String s) {
        char[] arr = s.toCharArray();
        char[] rev = reverseString(s);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) {
                return false;
            }
        }
        return true;
    }
}
