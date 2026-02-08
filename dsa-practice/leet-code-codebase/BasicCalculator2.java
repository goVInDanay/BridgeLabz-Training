class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n = 0;
        char op = '+';
        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch <= 57) {
                n = n * 10 + (ch - '0');
            }
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || i == s.length() - 1){
                if(op == '+'){
                    st.push(n);
                }
                else if(op == '-'){
                    st.push(-n);
                }
                else if(op=='*'){
                    st.push(st.pop() * n);
                }
                else if(op == '/'){
                    st.push(st.pop() / n);
                }
                n = 0;
                op = ch;
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}