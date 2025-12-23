import java.util.*;
public class DigitFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int freq[] = new int[10];
		int count = 0;
		int num = n;
		while(num > 0) {
			num = num / 10;
			count++;
		}
		int digit[] = new int[count];
		int idx = 0;
		while(n > 0) {
			digit[idx++] = n % 10;
			n = n / 10;
		}
		for(int i = 0; i < count; i++) {
			freq[digit[i]]++;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("Frequency of digit " + i + " is " + freq[i]);
		}
	}

}
