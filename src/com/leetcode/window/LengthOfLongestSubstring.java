package com.leetcode.window;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0, res = 0;
        while (right < s.length()) {
            Character c = s.charAt(right);
            right++;
            if (window.containsKey(c)) {
                window.put(c, window.get(c) + 1);
            } else {
                window.put(c, 1);
            }

            while (window.get(c) > 1) {
                Character d = s.charAt(left);
                left++;
                window.put(d, window.get(d) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
