class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int arr[] = new int[10];
        int n = secret.length();
        for(int i = 0; i < n; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }
            else{
                if(arr[secret.charAt(i) - '0']++ < 0){
                    cows++;
                }
                if(arr[guess.charAt(i) - '0']-- > 0){
                    cows++;
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
}