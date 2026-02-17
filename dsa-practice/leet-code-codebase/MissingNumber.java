class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 1; i <= n; i++){
            ans = ans ^ i;
        }
        for(int i : nums){
            ans = ans ^ i;
        }
        return ans;
    }
}