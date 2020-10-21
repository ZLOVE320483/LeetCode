package com.leetcode;

public class SortColors {

    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        for (int n : nums) {
            if (n == 0) {
                redCount++;
            } else if (n == 1) {
                whiteCount++;
            } else {
                blueCount++;
            }
        }
        for (int i = 0; i < redCount; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < whiteCount; i++) {
            nums[redCount + i] = 1;
        }
        for (int i = 0; i < blueCount; i++) {
            nums[redCount + whiteCount + i] = 2;
        }
    }
}
