package core_java_practice.scenario_based;
import java.util.*;
public class FindDuplicateElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int freq[] = new int[100000];
		for(int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}
		int duplicates[] = new int[n];
		int idx = 0;
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] > 1) {
				duplicates[idx++] = i; 
			}
		}
		System.out.println("Duplicate Elements");
		for(int i = 0; i < idx; i++) {
			System.out.println(duplicates[i]);
		}
	}

}
