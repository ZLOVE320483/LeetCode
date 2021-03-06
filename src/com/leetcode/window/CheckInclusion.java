package com.leetcode.window;

import java.util.HashMap;
import java.util.Map;

public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {

        // 存储 s1 串的信息， key-value 对应的是每个字符和该字符的个数
        Map<Character, Integer> needs = new HashMap<>();

        // 遍历 s2 串，存储滑动窗口的信息
        Map<Character, Integer> window = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            if (needs.containsKey(c)) {
                needs.put(c, needs.get(c) + 1);
            } else {
                needs.put(c, 1);
            }
        }

        int left = 0, right = 0;

        // 窗口中 字符个数与 needs 中字符个数相等时的数量
        int valid = 0;

        while (right < s2.length()) {
            Character c = s2.charAt(right);
            right++;
            if (needs.containsKey(c)) {
                if (window.containsKey(c)) {
                    window.put(c, window.get(c) + 1);
                } else {
                    window.put(c, 1);
                }
                if (window.get(c).equals(needs.get(c))) {
                    valid++;
                }
            }
            while (right - left >= s1.length()) {
                if (valid == needs.size()) {
                    return true;
                }
                Character d = s2.charAt(left);
                left++;
                if (needs.containsKey(d)) {
                    if (window.get(d).equals(needs.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return false;
    }
}
