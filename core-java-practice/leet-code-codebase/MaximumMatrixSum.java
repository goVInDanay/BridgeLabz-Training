class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        int count = 0;
        for(int arr[] : matrix){
            for(int i : arr){
                if(i < 0){
                    count++;
                    i = -i;
                }
                sum += i;
                if(i < min){
                    min = i;
                }
            }
        }
        return count % 2 == 0 ? sum : (sum - 2 * min);
    }
}