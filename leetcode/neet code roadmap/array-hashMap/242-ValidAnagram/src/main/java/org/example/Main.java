package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        Solution solution = new Solution();
        if (solution.isAnagram(s,t)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!count.containsKey(c) || count.get(c) == 0 ) return false; //t tem a mesma letra que s, porém mais vezes.
            count.put(c, count.get(c) - 1);
        }
        return true;
    }
}
