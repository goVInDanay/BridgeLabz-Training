class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        int missing = -1;
        for(int i : nums){
            if(!set.add(i)){
                repeat = i;
                break;
            }
        }
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{repeat, missing};
    }
}