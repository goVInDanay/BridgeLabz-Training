class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int max = 1;
        for(int i = 0; i < n; i++){
            int freq[] = new int[26];
            int count = 0;
            int maxFreq = 0;
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                if(freq[ch - 'a'] == 0){
                    count++;
                }
                freq[ch - 'a']++;
                maxFreq = Math.max(maxFreq, freq[ch - 'a']);
                int len = j - i + 1;
                if(count * maxFreq == len){
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }
}