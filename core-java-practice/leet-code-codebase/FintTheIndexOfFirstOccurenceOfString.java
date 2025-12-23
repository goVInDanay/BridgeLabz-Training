class Solution {
    public int strStr(String haystack, String needle) {
        int left = 0;
        int right = 0;
        int i = 0;
        int n = haystack.length();
        int m = needle.length();
        while(right < n && i < m){
            if(haystack.charAt(right) == needle.charAt(i)){
                i++;
                right++;
            }
            else{
                left++;
                right = left;
                i = 0;
            }
        }
        if(i < m){
            return -1;
        }
        return right - m;
    }
}