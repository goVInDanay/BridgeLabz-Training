class KthLargest {
    PriorityQueue<Integer> pq ;
    int n = 0;
    public KthLargest(int k, int[] nums) {
        n = k;
        pq = new PriorityQueue<>(k);
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        if(pq.size() < n){
            pq.offer(val);
        }
        else if(pq.peek() < val){
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */