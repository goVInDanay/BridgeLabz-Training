class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int nums[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }
    private void merge(int []nums, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int k = 0;
        for(int i = start; i < start + n1; i++){
            left[k++] = nums[i];
        }
        k = 0;
        for(int i = mid + 1; i < mid + 1 + n2; i++){
            right[k++] = nums[i];
        }
        int i = 0; 
        int j = 0;
        k = start;
        while(i < n1 && j < n2){
            if(left[i] < right[j]){
                nums[k++] = left[i++];
            }
            else{
                nums[k++] = right[j++];
            }
        }
        while(i < n1){
            nums[k++] = left[i++];
        }
        while(j < n2){
            nums[k++] = right[j++];
        }
    }
}