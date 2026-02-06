class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n < 2){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int arr[] = intervals[0];
        int i = 0;
        while(i < n){
            while(i < n && intervals[i][0] <= arr[1]){
                arr[1] = Math.max(intervals[i][1], arr[1]);
                i++;
            }
            ans.add(arr);
            if(i < n){
                arr = intervals[i];
            }
        }
        int res[][] = new int[ans.size()][2];
        for(i = 0; i < ans.size(); i++){
            res[i][0] = ans.get(i)[0];
            res[i][1] = ans.get(i)[1];
        }
        return res;
    }
}