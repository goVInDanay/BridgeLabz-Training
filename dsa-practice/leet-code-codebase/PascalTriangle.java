class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ans.add(new ArrayList<>(ls));
        ls.remove(0);
        for(int i = 1; i < numRows; i++){
            List<Integer> prev = new ArrayList<>(ans.get(i - 1));
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1;j < i; j++){
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;
    }
}