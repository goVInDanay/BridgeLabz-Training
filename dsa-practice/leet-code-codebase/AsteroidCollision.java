class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] > 0){
                stack.push(i);
            }
            else {
                while(!stack.isEmpty() && asteroids[stack.peek()] > 0 && Math.abs(asteroids[i]) > asteroids[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty() || asteroids[stack.peek()] < 0){
                    stack.push(i);
                }
                else if(Math.abs(asteroids[i]) == asteroids[stack.peek()]) {
                    stack.pop();
                }
            }
        }
        int ans[] = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--){
            ans[i] = asteroids[stack.pop()];
        }
        return ans;
    }
}