class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(2 * stack.peek());
            }
            else if(operations[i].equals("+")){
                int k = stack.pop();
                int p = stack.peek();
                stack.push(k);
                stack.push(k + p);
            }
            else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        int ans = 0;
        while(!stack.empty()){
            ans += stack.pop();
        }
        return ans;
    }
}