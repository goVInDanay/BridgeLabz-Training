class MinStack {
    private class Node{
        private int val;
        private int min;
        private Node prev;
        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
        public Node(int val, int min, Node prev){
            this.val = val;
            this.min = min;
            this.prev = prev;
        }
    }
    
    private Node head;
    
    public void push(int val) {
        if(head == null){
            head = new Node(val, val);
        }
        else{
            int min = Math.min(head.min, val);
            head = new Node(val, min, head);
        }
    }
    
    public void pop() {
        head = head.prev;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */