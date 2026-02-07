class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int arr[] : intervals){
            if(newInterval[1] < arr[0]){
                ans.add(newInterval);
                newInterval = arr;
            }
            else if(arr[1] < newInterval[0]){
                ans.add(arr);
            }
            else{
                newInterval[0] = Math.min(newInterval[0], arr[0]);
                newInterval[1] = Math.max(newInterval[1], arr[1]);
            }
        }
        ans.add(newInterval);
        int res[][] = new int[ans.size()][2];
        int i = 0;
        for(int arr[] : ans){
            res[i++] = arr;
        }
        return res;
    }
}