class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '|'){
                if(stack.isEmpty()) {
                    stack.push(ch);
                }
                else{
                    stack.pop();
                }
            }
            else{
                if(ch == '*' && stack.isEmpty()){
                    count++;
                }
            }
        }
        return count;
    }
}