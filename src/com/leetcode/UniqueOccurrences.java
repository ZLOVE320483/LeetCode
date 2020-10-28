package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> firstMap = new HashMap<>();
        for (int num : arr) {
            if (firstMap.get(num) == null) {
                firstMap.put(num, 1);
            } else {
                int value = firstMap.get(num);
                firstMap.put(num, value + 1);
            }
        }
        Map<Integer, Integer> secondMap = new HashMap<>();
        for (Integer value : firstMap.values()) {
            if (secondMap.get(value) != null) {
                return false;
            } else {
                secondMap.put(value, 1);
            }
        }
        return true;
    }
}
