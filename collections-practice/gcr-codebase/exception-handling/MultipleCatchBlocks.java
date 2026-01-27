package collections.gcr_codebase.exception_handling;

import java.util.*;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int index = sc.nextInt();
			System.out.println("Value at index " + index + ": " + arr[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid index!");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Array is not initialized!");
		}
	}

}
