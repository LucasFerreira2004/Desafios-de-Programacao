package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        Solution solution = new Solution();
        List<List<String>> res = solution.groupAnagrams(strings);

        System.out.print("[");
        int resIndex = 0;
        for (List<String> list : res){
            System.out.print("[");
            for(int i = 0; i < list.size(); i++) {
                System.out.print("\""+list.get(i)+"\"");
                if (i + 1 < list.size()) System.out.print(", ");
            }
            System.out.print("]");
            if(resIndex++ < res.size() - 1) System.out.print(",");
        }
        System.out.print("]");

    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            for (char c : strs[i].toCharArray()) {
                count[c - 'a']++;
            }
            map.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            map.get(Arrays.toString(count)).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}

