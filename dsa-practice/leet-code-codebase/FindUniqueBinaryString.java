class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            char ch = '0';
            if(nums[i].charAt(i) == '0'){
                ch = '1';
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}