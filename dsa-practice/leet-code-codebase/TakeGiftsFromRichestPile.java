class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        int n = gifts.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts){
            pq.offer(i);
        }
        while(k-- > 0){
            int val = pq.poll();
            pq.offer((int)Math.sqrt(val));
        }
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        return ans;
    }
}