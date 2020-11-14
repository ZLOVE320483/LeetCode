package com.leetcode;

import java.util.*;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;
        for (int member : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == member) {
                    result[index] = member;
                    index++;
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int member : arr2) {
            set.add(member);
        }
        int start = index;
        for (int member : arr1) {
            if (!set.contains(member)) {
                result[index] = member;
                index++;
            }
        }
        Arrays.sort(result, start, index);
        return result;
    }
}
