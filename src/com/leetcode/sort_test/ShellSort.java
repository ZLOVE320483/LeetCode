package com.leetcode.sort_test;

public class ShellSort {

    public static void sort(int[] nums) {
        int length = nums.length;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = nums[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && nums[preIndex] > tmp) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex -= gap;
                }
                nums[preIndex + gap] = tmp;
            }
            gap /= 2;
        }
    }
}
