import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();            // take HashMap to store unique number and its index values
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];                        // take a variable diff to store the difference between current value and the target
            if(map.containsKey(diff) && map.get(diff) != i){    // check if diff is in the hashmap
                return new int[]{map.get(diff), i};             // if diff is inside hashmap, return the indexes
            }
            map.put(nums[i], i);                                //store the number and its index in hashmap
        }   
        return new int[]{};                                     //if no values found, return empty array
    }
}
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution s = new Solution();
        int ans[] = s.twoSum(arr, target);
        if(ans.length > 0){
            System.out.println(arr[ans[0]] + " " + arr[ans[1]]);
        }
        else{
            System.out.println("No two numbers add up to target");
        }
    }
}