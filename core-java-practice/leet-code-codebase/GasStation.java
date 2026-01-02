class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gasSum = 0;
        int costSum = 0;
        for(int i = 0; i < n; i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(gasSum < costSum){
            return -1;
        }
        int sum = 0;
        int start = 0;
        for(int i = 0; i < n; i++){
            sum += gas[i];
            sum = sum - cost[i];
            if(sum < 0){
                sum = 0;
                start = i + 1;
            }
        }
        return start;
    }
}