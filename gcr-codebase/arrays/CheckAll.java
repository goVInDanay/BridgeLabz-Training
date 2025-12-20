import java.util.*;

import javax.print.attribute.standard.PrinterName;
public class CheckAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0) {
				System.out.println(nums[i] + " is less than zero");
			}
			else if(nums[i] == 0) {
				System.out.println(nums[i] + " is equal to zero");
			}
			else {
				if(nums[i] % 2 == 0) {
					System.out.println(nums[i] + " is positive and even");
				}
				else {
					System.out.println(nums[i] + " is positive and odd");
				}
			}
		}
		if(nums[0] == nums[nums.length - 1]) {
			System.out.println("The first element " + nums[0] + " and last element " + nums[nums.length - 1] + " are equal");
		}
		else if(nums[0] < nums[nums.length - 1]) {
			System.out.println("The first element " + nums[0] + " is smaller than the last element " + nums[nums.length - 1]);
		}
		else {
			System.out.println("The first element " + nums[0] + " is greater than the last element " + nums[nums.length - 1]);
		}
	}

}
