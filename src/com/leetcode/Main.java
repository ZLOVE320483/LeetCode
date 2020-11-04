package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };
        int[] newInterval = {4, 9};
        IntervalInsert intervalInsert = new IntervalInsert();
        int[][] res = intervalInsert.insert(intervals, newInterval);
        for (int i = 0; i < res.length; i++) {
            PrintUtils.printIntArray(res[i]);
        }
    }
}