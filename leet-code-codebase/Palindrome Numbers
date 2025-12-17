class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else if(x == 0){
            return true;
        }
        else{
            int d = 0;
            int num = 0;
            int n = x;
            while(n > 0){
                d = n % 10;
                num = num * 10 + d;
                n = n / 10;
            }
            if(num == x){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
