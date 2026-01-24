class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            max = Math.max(max, (nums[left++] + nums[right--]));
        }
        return max;
    }
}