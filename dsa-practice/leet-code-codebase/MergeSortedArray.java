class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        merge(nums1, nums2);
    }
    public static void merge(int arr1[],int arr2[]){
        int ans[] = new int[arr1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length - arr2.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i < arr1.length - arr2.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        for(int x = 0; x < arr1.length; x++){
            arr1[x] = ans[x];
        }
    }
}