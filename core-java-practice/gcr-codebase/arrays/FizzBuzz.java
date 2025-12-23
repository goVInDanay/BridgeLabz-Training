import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
			if((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
				arr[i] = "FizzBuzz";
			}
			else if((i + 1) % 3 == 0) {
				arr[i] = "Fizz";
			}
			else if((i + 1) % 5 == 0) {
				arr[i] = "Buzz";
			}
			else {
				arr[i] = Integer.toString(i);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}	

}
