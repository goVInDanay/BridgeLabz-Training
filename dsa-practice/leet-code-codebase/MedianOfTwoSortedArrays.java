class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int len = n1 + n2;
        int arr[] = new int[len];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }
            else{
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i  <n1){
            arr[k] = nums1[i];
            i++;
            k++;
        }   
        while(j < n2){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        double median;
        len--;
        if(len % 2 != 0){
            median = (double)(arr[len / 2] + arr[len / 2 + 1]) / 2;
        }
        else{
            median = arr[len / 2];
        }
        return median;
    }
}