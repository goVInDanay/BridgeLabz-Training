package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class NumberChecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = countDigits(n);
		int digits[] = getDigitsArray(n);
		int digitSum = sumOfDigits(digits);
		double digitSqrSum = sumOfSquares(digits);
		boolean isHarshad = isHarshadNumber(n, digits);
		int freq[][] = frequencyOfDigits(digits);
		System.out.println("Count of digits " + count);
		System.out.println("Digits " + Arrays.toString(digits));
		System.out.println("Harshad " + isHarshad);
		System.out.println("Digit Sum " + digitSum);
		System.out.println("Digit Squared Sum " + digitSqrSum);
		System.out.println("Digits Frequency -> ");
		for(int i = 0; i < 10; i++) {
			if(freq[i][1] > 0) {
				System.out.println("Digit " + freq[i][0] + " Frequency " + freq[i][1]);
			}
		}
	}
	public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
    public static int[] getDigitsArray(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    public static int sumOfDigits(int digits[]) {
    	int sum = 0;
    	for(int d : digits) {
    		sum += d;
    	}
    	return sum;
    }
    public static double sumOfSquares(int digits[]) {
    	double sum = 0;
    	for(int d : digits) {
    		sum += Math.pow(d, 2);
    	}
    	return sum;
    }
    public static boolean isHarshadNumber(int n, int digits[]) {
    	return n % sumOfDigits(digits) == 0;
    }
    public static int[][] frequencyOfDigits(int digits[]) {
    	int freq[][] = new int[10][2];
    	for(int i = 0; i < 10; i++) {
    		freq[i][0] = i;
    	}
    	for(int d : digits) {
    		freq[d][1]++;
    	}
    	return freq;
    }

}
