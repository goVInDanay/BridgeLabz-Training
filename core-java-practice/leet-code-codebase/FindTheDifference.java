class Solution {
    public char findTheDifference(String s, String t) {
        int ch = 0;
        for(int i = 0; i < s.length(); i++){
            ch = ch ^ s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            ch = ch ^ t.charAt(i);
        }
        return (char)ch;
    }
}