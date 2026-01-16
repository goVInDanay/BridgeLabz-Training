package dsa_practice.gcr_codebase.string_builder_and_buffer;
import java.util.*;

public class ConcatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strs[] = new String[n];
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			strs[i] = sc.nextLine();
		}
		
		StringBuffer sbf = new StringBuffer();
		for(String str : strs) {
			sbf.append(str + " ");
		}
		System.out.println(sbf);
	}

}
