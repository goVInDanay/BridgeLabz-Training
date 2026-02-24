class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int newEmpty = empty / numExchange;
            empty = empty % numExchange;
            count += newEmpty;
            empty += newEmpty;
        }
        return count;
    }
}