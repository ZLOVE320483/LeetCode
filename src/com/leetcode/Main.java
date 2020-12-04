package com.leetcode;

import com.leetcode.dp.MaxProfitV;
import com.leetcode.utils.PrintUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 4},
                {3, 6},
                {2, 8}
        };

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        for (int[] arr : intervals) {
            PrintUtils.printIntArray(arr);
        }
    }
}