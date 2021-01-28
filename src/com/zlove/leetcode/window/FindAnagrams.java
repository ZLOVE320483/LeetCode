package com.zlove.leetcode.window;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> needs = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (Character c : p.toCharArray()) {
            if (needs.containsKey(c)) {
                needs.put(c, needs.get(c) + 1);
            } else {
                needs.put(c, 1);
            }
        }

        List<Integer> res = new LinkedList<>();
        int left = 0, right = 0, valid = 0;
        while (right < s.length()) {
            Character c = s.charAt(right);
            right++;
            if (needs.containsKey(c)) {
                if (window.containsKey(c)) {
                    window.put(c, window.get(c) + 1);
                } else {
                    window.put(c, 1);
                }
                if (needs.get(c).equals(window.get(c))) {
                    valid++;
                }
            }
            while (right - left >= p.length()) {
                if (valid == needs.size()) {
                    res.add(left);
                }
                Character d = s.charAt(left);
                left++;
                if (needs.containsKey(d)) {
                    if (needs.get(d).equals(window.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return res;
    }
}
