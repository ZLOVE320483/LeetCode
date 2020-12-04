package com.leetcode;

import com.leetcode.interval.MergeInterval;
import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 4},
                {1, 5}
        };

        MergeInterval interval = new MergeInterval();
        int[][] res = interval.merge(intervals);

        for (int[] arr : res) {
            PrintUtils.printIntArray(arr);
        }
    }
}