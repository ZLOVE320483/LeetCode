package com.zlove.leetcode.window;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    public static String minWindow(String s, String t) {
        Map<Character, Integer> needs = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (needs.containsKey(c)) {
                needs.put(c, needs.get(c) + 1);
            } else {
                needs.put(c, 1);
            }
        }

        int left = 0, right = 0, valid = 0;
        int start = 0, len = Integer.MAX_VALUE;

        while (right < s.length()) {
            Character character = s.charAt(right);
            right++;
            if (needs.containsKey(character)) {
                if (window.containsKey(character)) {
                    window.put(character, window.get(character) + 1);
                } else {
                    window.put(character, 1);
                }
                if (needs.get(character).equals(window.get(character))) {
                    valid++;
                }
            }
            while (valid == needs.size()) {
                if (right - left < len) {
                    len = right - left;
                    start = left;
                }
                Character d = s.charAt(left);
                left++;
                if (needs.containsKey(d)) {
                    if (window.get(d).equals(needs.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
