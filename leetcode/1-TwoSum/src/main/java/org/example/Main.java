package org.example;
import java.util.Arrays;

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
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}