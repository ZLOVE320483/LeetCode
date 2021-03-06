package com.leetcode.window;

import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串
 *
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 *
 * 注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。
 *
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 *
 * 输入：s = "a", t = "a"
 * 输出："a"
 */
public class MinWindow {

    public String minWindow(String s, String t) {
        // needs: 用来存储t，key是t串中的每个字符， value是t串中每个字符的个数
        Map<Character, Integer> needs = new HashMap<>();

        // window: 滑动窗口，用来存储遍历s串的接口，跟 needs 做比较
        Map<Character, Integer> window = new HashMap<>();

        // 填充 needs
        for (Character c : t.toCharArray()) {
            if (needs.containsKey(c)) {
                needs.put(c, needs.get(c) + 1);
            } else {
                needs.put(c, 1);
            }
        }

        // valid: window 与 needs 中，同key, 同value的个数
        int left = 0, right = 0, valid = 0;

        // len: 最小长度
        int start = 0, len = Integer.MAX_VALUE;

        while (right < s.length()) {
            Character c = s.charAt(right);
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
            while (valid == needs.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
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
