package dsa_practice.gcr_codebase.string_builder_and_buffer;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder str = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(!set.contains(ch)) {
				str.append(ch);
			}
			set.add(ch);
		}
		System.out.println(str);
	}

}
