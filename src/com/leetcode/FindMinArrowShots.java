package com.leetcode;

import com.leetcode.utils.PrintUtils;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class FindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> a[1] > b[1] ? 1 : -1);
        int count = 1;
        int last = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (last < points[i][0]) {
                last = points[i][1];
                count++;
            }
        }
        return count;
    }
}
