class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int curr = -1;
        while(n > 0){
            if((n & 1) == 1){
                if(curr != 0){
                    max = Math.max(max, curr);
                }
                curr = 1;
            }
            else{
                if(curr != -1){
                    curr++;
                }
            }
            n = n >> 1;
        }
        return max;
    }
}