import java.util.*;
public class TwoDToOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int matrix[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int arr[] = new int[rows * cols];
		int idx = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr[idx++] = matrix[i][j];
			}
		}
		for(int i = 0; i  < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
