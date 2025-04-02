package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] n = {1,1,1,3,3,4,3,2,4,2};
        Solution solution = new Solution();
        if (solution.containsDuplicate(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}