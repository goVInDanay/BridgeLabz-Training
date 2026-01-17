package dsa_practice.gcr_codebase.linear_search;
import java.util.*;

public class FindWord {

	public static String findWord(String strs[], String target) {
		for(String s : strs) {
			for(String str : s.split(" ")) {
				if(str.equalsIgnoreCase(target)) {
					return s;
				}
			}
		}
		return "Not found";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strs[] = new String[n];
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			strs[i] = sc.nextLine();
		}
		String target = sc.next();
		System.out.println(findWord(strs, target));
	}

}
