class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];
        int n = ransomNote.length();
        int m = magazine.length();
        for(int i = 0; i < n; i++){
            char ch = ransomNote.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < m; i++){
            char ch = magazine.charAt(i);
            freq[ch - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                return false;
            }
        }
        return true;
    }
}