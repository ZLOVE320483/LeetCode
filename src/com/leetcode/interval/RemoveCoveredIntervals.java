package com.leetcode.interval;

import java.util.Arrays;

public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int res = 0;
        int left = intervals[0][0], right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] inter = intervals[i];
            if (left <= inter[0] && right >= inter[1]) {
                res++;
            }
            if (right < inter[1]) {
                right = inter[1];
            }
            if (right < inter[0]) {
                left = inter[0];
                right = inter[1];
            }
        }
        return intervals.length - res;
    }
}
