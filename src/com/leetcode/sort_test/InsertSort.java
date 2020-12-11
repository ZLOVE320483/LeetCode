package com.leetcode.sort_test;

public class InsertSort {

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && nums[preIndex] > current) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = current;
        }
    }
}
