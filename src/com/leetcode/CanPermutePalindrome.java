package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanPermutePalindrome {

    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer value = map.get(c);
            if (value == null) {
                map.put(c, 1);
            } else {
                map.put(c, value + 1);
            }
        }
        int n = 0;
        for (Integer values : map.values()) {
            if (values % 2 != 0) {
                n++;
            }
        }
        return n <= 1;
    }

}
