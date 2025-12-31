class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        int start = complexity[0];
        final int MOD = (int)(Math.pow(10, 9)) + 7;
        for(int i = 1; i < n; i++){
            if(complexity[i] <= start){
                return 0;
            }
        }
        long factorial = 1;
        for(int i = 2; i < n; i++){
            factorial = (factorial * i) % MOD;
        }
        return (int)factorial;
    }
}