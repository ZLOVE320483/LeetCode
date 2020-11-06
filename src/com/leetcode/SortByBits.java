package com.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class SortByBits {

    public int[] sortByBits(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
        }
        Arrays.sort(res);
        for (int i = 0; i < res.length; i++) {
            res[i] = res[i] % 10000000;
        }
        return res;
    }
}
