package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        Solution solution = new Solution();
        int[] awser = solution.topKFrequent(nums, k);
        for (int i = 0; i < awser.length; i++) {
            System.out.print(awser[i] + " ");
        }
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFrequence = new HashMap<>();
        int[] awser = new int[k];
        for (int num : nums) {
            numFrequence.put(num, numFrequence.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            int frequency = 0;
            int num = 0;
            for (var entry : numFrequence.entrySet()) {
                if (entry.getValue() > frequency) {
                    frequency = entry.getValue();
                    num = entry.getKey();
                }
            }
            awser[i] = num;
            numFrequence.remove(num);
        }

        return awser;
    }
}