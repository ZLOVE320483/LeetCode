package com.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class MaxWidthOfVerticalArea {

    public int maxWidthOfVerticalArea(int[][] points) {
        int length = points.length;
        if (length < 2) {
            return 0;
        }
        int[] xArray = new int[length];
        for (int i = 0; i < length; i++) {
            xArray[i] = points[i][0];
        }
        Arrays.sort(xArray);
        int max = 0;
        for (int i = 1; i < xArray.length; i++) {
            if (xArray[i] - xArray[i - 1] > max) {
                max = xArray[i] - xArray[i - 1];
            }
        }
        return max;
    }
}
