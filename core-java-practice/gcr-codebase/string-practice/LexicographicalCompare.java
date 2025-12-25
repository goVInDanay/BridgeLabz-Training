package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class LexicographicalCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int val = compareStrings(s1, s2);
		if(val == 0) {
			System.out.println("String " + s1 + " and String " + s2 + " are equal");
		}
		else {
			System.out.println("String " + (val == 1 ? s1 : s2) + " comes before " + (val == 1 ? s2 : s1));
		}
	}
	public static int compareStrings(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int idx1 = 0;
		int idx2 = 0;
		while(idx1 < n && idx2 < m) {
			if(s1.charAt(idx1) < s2.charAt(idx2)) {
				return 1;
			}
			else if(s1.charAt(idx1) > s2.charAt(idx2)) {
				return -1;
			}
			else {
				idx1++;
				idx2++;
			}
		}
		return n == m ? 0 : n < m ? 1 : -1;
	}

}
