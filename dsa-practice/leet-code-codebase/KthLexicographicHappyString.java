class Solution {
    List<String> ls = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public String getHappyString(int n, int k) {
        dfs(n, ' ');
        Collections.sort(ls);
        if(ls.size() < k){
            return "";
        }
        return ls.get(k - 1);
    }
    private void dfs(int n, char ch){
        if(sb.length() == n){
            ls.add(sb.toString());
            return;
        }
        for(int i = 0; i < 3; i++){
            char chr = (char)('a' + i);
            if(chr != ch){
                sb.append(chr);
                dfs(n, chr);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}