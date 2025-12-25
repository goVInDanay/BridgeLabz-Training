package core_java_practice.gcr_codebase.string_practice;
import java.util.*;
public class FindSubstringOccureneces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String sub = sc.next();
		System.out.println("Count " + findSubstringOccurences(s, sub));
	}
	public static int findSubstringOccurences(String s, String sub) {
		int count = 0;
		int n = s.length();
		int m = sub.length();
		if(m > n) {
			return 0;
		}
		for(int i = 0; i < n; i++) {
			boolean flag = true;
			int idx = i;
			for(int j = 0; j < m; j++) {
				if(idx < n && s.charAt(idx) != sub.charAt(j)) {
					flag = false;
					break;
				}
				idx++;
			}
			if(flag) {
				count++;
				i = idx - 1;
			}
		}
		return count;
	}

}
