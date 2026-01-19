package dsa_practice.gcr_codebase.algorithm_runtime_analysis;

public class SearchingComplexity {

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		long startTime = System.nanoTime();
		for(int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for(int j = 0; j < n - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Time Taken: " + (endTime - startTime));
	}
	
	public static void mergeSort(int arr[], int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, right, mid);
		}
	}
	public static void merge(int arr[], int left, int right, int mid) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for(int i = 0; i < n1; i++) {
			leftArr[i] = arr[i];
		}
		for(int i = 0; i < n2; i++) {
			rightArr[i] = arr[mid + i + 1];
		}
		int i = 0;
		int j = 0;
		int idx = 0;
		while(i < n1 && j < n2) {
			if(leftArr[i] < rightArr[j]) {
				arr[idx++] = leftArr[i++];
			}
			else {
				arr[idx++] = rightArr[j++];
			}
		}
		while(i < n1) {
			arr[idx++] = leftArr[i++];
		}
		while(j < n2) {
			arr[idx++] = rightArr[j++];
		}
	}
	
	public static void quickSort(int arr[], int left, int right) {
		if(left < right) {
			int pivotIdx = partition(arr, left, right);
			quickSort(arr, left, pivotIdx - 1);
			quickSort(arr, pivotIdx + 1, right);
		}
	}
	
	public static int partition(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		for(int j = left; j < right; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = pivot;
		arr[right] = temp;
		return i + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000000;
		int arr[] = new int[n];
		for(int i = n - 1; i >= 0; i--) {
			arr[i] = i % 2 == 0 ? i + 1 : i - 1;
		}
		int arr1[] = arr.clone();
		int arr2[] = arr.clone();
		int arr3[] = arr.clone();
		bubbleSort(arr1);
		long startTime = System.nanoTime();
		mergeSort(arr2, 0, n - 1);
		long endTime = System.nanoTime();
		System.out.println("Merge Time Taken: " + (endTime - startTime));
		startTime = System.nanoTime();
		quickSort(arr3, 0, n - 1);
		endTime = System.nanoTime();
		System.out.println("Quick Time Taken: " + (endTime - startTime));
	}

}
