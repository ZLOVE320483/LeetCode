package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumRabbits {

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ans : answers) {
            if (map.containsKey(ans)) {
                map.put(ans, map.get(ans) + 1);
            } else {
                map.put(ans, 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int k = entry.getKey();
            int a = k + 1;
            while (a < count) {
                a += (k + 1);
            }
            sum += a;
        }
        return sum;
    }
}
