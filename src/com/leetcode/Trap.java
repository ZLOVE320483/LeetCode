package com.leetcode;

/**
 * https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class Trap {

    public int trap(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int maxLeft = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > maxLeft) {
                    maxLeft = height[j];
                }
            }
            int maxRight = 0;
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > maxRight) {
                    maxRight = height[j];
                }
            }
            int minHeight = Math.min(maxLeft, maxRight);
            if (minHeight > height[i]) {
                sum += (minHeight - height[i]);
            }
        }
        return sum;
    }

}
