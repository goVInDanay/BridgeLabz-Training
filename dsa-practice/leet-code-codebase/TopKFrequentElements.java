class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? Integer.compare(a.getKey(), b.getKey()) : Integer.compare(b.getValue(), a.getValue()));
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            pq.offer(mp);
        }
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = (int)pq.poll().getKey();
        }
        return ans;
    }
}