class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int count = 0;
        int cost = money;
        for(int i = 0; i < prices.length; i++){
            if(money < prices[i]){
                return cost;
            }
            else{
                money -= prices[i];
                count++;
            }
            if(count == 2){
                break;
            }
        }
        return money;
    }
}