package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CheckInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CheckInteger obj = new CheckInteger();
		System.out.println(obj.checkInteger(n));
	}
	private int checkInteger(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n > 0) {
			return 1;
		}
		return -1;
	}

}
