package core_java_practice.gcr_codebase.methods;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class BuiltInDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Random Numbers ->");
		generateRandomNumbers();
		System.out.println("Random Integer (0-99) " + generateRandomNumber());
		System.out.println();
		System.out.println("Math Functions ->");
		mathFunctions();
		System.out.println();
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("\nArray Functions ->");
		arrayFunctions(size);
		System.out.println();
		System.out.println("Enter a string");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("\nString Functions ->");
		stringFunctions(s);
		System.out.println();
	}
	public static double generateRandomNumbers() {
		double randomDouble = Math.random() * 100;
		System.out.println("Random Double (0-100) " + randomDouble);
		return randomDouble;
	}
	public static int[] generateRandomNumbers(int size) {
		int arr[] = new int[size];
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
	public static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(100);
	}
	public static int generateRandomNumber(int size) {
		Random random = new Random();
		return random.nextInt(size / 2);
	}
	public static int generateRandomNumber(int startIdx, int size) {
		Random random = new Random();
		return random.nextInt(startIdx, size);
	}
	public static void mathFunctions() {
		int n = -generateRandomNumber();
		System.out.println("Absolute value of " + n  + " is " + Math.abs(n));
		n = generateRandomNumber();
		System.out.println("Square root of " + n + " is " + Math.sqrt(n));
		double num = generateRandomNumbers();
		int pow = generateRandomNumber();
		System.out.println(num + " raised to the power " + pow + " is " + Math.pow(num, pow));
	}
	
	public static void arrayFunctions(int size) {
		int arr[] = generateRandomNumbers(size);
		System.out.println("Array " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array " + Arrays.toString(arr));
		int num = generateRandomNumber();
		int idx = Arrays.binarySearch(arr, num);
		System.out.println("Index of " + num + " using binary search is " + idx);
		
	}
	public static void stringFunctions(String s) {
		System.out.println("Original String " + s);
		System.out.println("Length of String " + s.length());
		System.out.println("Uppercase String " + s.toUpperCase());
		System.out.println("Lower Case " + s.toLowerCase());
		int startIdx = generateRandomNumber(s.length());
		int endIdx = generateRandomNumber(startIdx, s.length());
		System.out.println("Substring (" + startIdx + "-" + endIdx + ") "+ s.substring(0, endIdx));
	}

}
