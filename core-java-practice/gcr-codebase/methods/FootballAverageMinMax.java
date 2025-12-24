package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FootballAverageMinMax {
	public int[] generate3DigitRandomArray(int size) {
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random() * 101) + 150;
		}
		return arr;
	}
	public double[] findAverageMinMax(int[] numbers) {
		int min = numbers[0];
		int max = numbers[0];
		double sum = 0;
		for(int n : numbers) {
			if(min > n) {
				min = n;
			}
			if(max < n) {
				max = n;
			}
			sum += n;
		}
		double average = sum / numbers.length;
		return new double[] {min, max, average};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FootballAverageMinMax obj = new FootballAverageMinMax();
		int numbers[] = obj.generate3DigitRandomArray(11);
		System.out.println("Heights of Player");
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
		double ans[] = obj.findAverageMinMax(numbers);
		System.out.println("Min " + ans[0] + " Max " + ans[1] + " Average " + ans[2]);
	}

}
