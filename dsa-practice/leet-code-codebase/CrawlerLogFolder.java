class Solution {
    public int minOperations(String[] logs) {
       int steps = 0;
        for(String log : logs){
            if(log.equals("../")){
                if(steps > 0){
                    steps--;
                }
            }
            else if(log.equals("./")){
                continue;
            }
            else{
                steps++;
            }
        }
        return steps;
    }
}