class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += factors(n);
        }
        return sum;
    }
    private int factors(int n){
        int sum = 0;
        int count = 0;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                int val = n / i;
                if(val == i || count > 0){
                    return 0;
                }
                sum += i + val;
                count++;
            }
        }
        return count == 1 ? sum + n + 1 : 0;
    }
}