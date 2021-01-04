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

    public int trapII(int[] height) {
        int sum = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while(left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {
                sum += (leftMax - height[left]);
                left++;
            } else {
                sum += (rightMax - height[right]);
                right--;
            }
        }
        return sum;
    }

}
