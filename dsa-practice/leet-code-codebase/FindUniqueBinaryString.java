class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(String s : nums){
            set.add(Integer.parseInt(s, 2));
        }
        int size = (int)Math.pow(2, n);
        for(int i = 0; i < size; i++){
            if(!set.contains(i)){
                String binary = Integer.toBinaryString(i);
                while(binary.length() < n){
                    binary = "0" + binary;
                }
                return binary;
            }
        }
        return "";
    }
}