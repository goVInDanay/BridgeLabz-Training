class Solution {
    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        StringBuilder sb = new StringBuilder();
        Deque<String> deque = new ArrayDeque<>();
        for(int i = 0; i < strs.length; i++){
            String current = strs[i];
            if(current.equals(".") || current.equals("")){
                continue;
            }
            else if(current.equals("..")){
                if(deque.size() > 0){
                    deque.removeLast();
                }
            }
            else{
                deque.addLast(current);
            }
        }
        if(deque.isEmpty()){
            return "/";
        }
        while(deque.size() > 0){
            sb.append("/");
            sb.append(deque.removeFirst());
        }
        return sb.toString();
    }
}