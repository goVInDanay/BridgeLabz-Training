class Solution {
    class Pair{
        int priority;
        String code;
        Pair(int priority, String code){
            this.priority = priority;
            this.code = code;
        }
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);
        List<Pair> ls = new ArrayList<>();
        for(int i = 0; i < code.length; i++){
            if(isActive[i] && priority.containsKey(businessLine[i]) && isValid(code[i])){
                ls.add(new Pair(priority.get(businessLine[i]), code[i]));
            }
        }
        Collections.sort(ls, (a, b) -> a.priority == b.priority ? a.code.compareTo(b.code) : a.priority - b.priority);
        List<String> ans = new ArrayList<>();
        for(Pair p : ls){
            ans.add(p.code);
        }
        return ans;
    }
    private boolean isValid(String s){
        if(s.length() == 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != '_'){
                return false;
            }
        }
        return true;
    }
}