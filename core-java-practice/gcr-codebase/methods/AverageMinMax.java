package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class AverageMinMax {
	public int[] generate4DigitRandomArray(int size) {
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random() * 9000) + 1000;
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
		AverageMinMax obj = new AverageMinMax();
		int numbers[] = obj.generate4DigitRandomArray(5);
		System.out.println("Numbers");
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
		double ans[] = obj.findAverageMinMax(numbers);
		System.out.println("Min " + ans[0] + " Max " + ans[1] + " Average " + ans[2]);
	}

}
