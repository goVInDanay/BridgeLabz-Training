package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class NumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] digits = getDigitsArray(n);
        int largeArr[] = largestAndSecondLargest(digits);
        int smallArr[] = smallestAndSecondSmallest(digits);
        System.out.println("Digits Count " + countDigits(n));
        System.out.println("Digits " + Arrays.toString(digits));
        System.out.println("Duck Number " + isDuckNumber(digits));
        System.out.println("Armstrong " + isArmstrong(n, digits));
        System.out.println("Largest " + largeArr[0] + " Second Largest " + largeArr[1]);
        System.out.println("Smallest " + smallArr[0] + " Second Smallest " + smallArr[1]);

	}
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] getDigitsArray(int number) {
        String s = String.valueOf(Math.abs(number));
        int[] digits = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for(int d : digits) {
            if(d != 0) {
            	return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for(int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }
    public static int[] largestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int d : digits) {
            if(d > max) {
                secondMax = max;
                max = d;
            }
            else if(d > secondMax && d != max) {
                secondMax = d;
            }
        }
        return new int[]{max, secondMax};
    }
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int d : digits) {
            if(d < min) {
                secondMin = min;
                min = d;
            }
            else if(d < secondMin && d != min) {
                secondMin = d;
            }
        }
        return new int[]{min, secondMin};
    }
}