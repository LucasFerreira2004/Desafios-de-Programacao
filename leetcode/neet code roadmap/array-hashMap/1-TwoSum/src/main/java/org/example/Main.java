package org.example;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 3};
        int target = 6;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(a, target)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                int complementIndex = map.get(complement);
                result[0] = i;
                result[1] = complementIndex;
                break;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}