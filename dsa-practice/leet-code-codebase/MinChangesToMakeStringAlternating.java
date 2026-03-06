class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            count += (s.charAt(i) & 1) ^ (i & 1);
        }
        return Math.min(count, n - count);
    }
}