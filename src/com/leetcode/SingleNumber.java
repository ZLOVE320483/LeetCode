package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.get(n) == null) {
                map.put(n, 1);
            } else {
                int val = map.get(n);
                map.put(n, val + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                entry.getKey();
            }
        }
        return 0;
    }
}
