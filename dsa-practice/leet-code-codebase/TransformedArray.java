class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int val = nums[((i + nums[i]) % n + n) % n];
            ans[i] = val;
        }
        return ans;
    }
}