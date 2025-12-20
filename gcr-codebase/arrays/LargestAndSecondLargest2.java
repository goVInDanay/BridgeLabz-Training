import java.util.Scanner;
public class LargestAndSecondLargest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxDigit = 10;
		int arr[] = new int[maxDigit];
		int i = 0;
		while(n > 0) {
			int digit = n % 10;
			arr[i++] = digit;
			n = n / 10;
			if(i == maxDigit) {
				maxDigit = maxDigit * 2;
				int temp[] = new int[maxDigit];
				for(int j = 0; j < i; j++) {
					temp[j] = arr[j];
				}
				arr = temp;
			}
		}
		int largest = 0;
		int secondLargest = 0;
		for(int j = 0; j < maxDigit; j++) {
			if(arr[j] > largest) {
				secondLargest = largest;
				largest = arr[j];
			}
			else if(arr[j] > secondLargest) {
				secondLargest = arr[j];
			}
		}
		System.out.println("Largest " + largest + " Second Largest " + secondLargest);
		
	}

}
