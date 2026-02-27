class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer nums[] = new Integer[n];
        for(int i = 0; i < n; i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a, b) -> {
            int count1 = Integer.bitCount(a);
            int count2 = Integer.bitCount(b);
            if(count1 == count2){
                return a - b;
            }
            return count1 - count2;
        });
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
        }
        return arr;
    }
}