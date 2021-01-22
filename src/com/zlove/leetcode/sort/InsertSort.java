package com.zlove.leetcode.sort;

public class InsertSort {

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int preIndex = i;
            int current = nums[i + 1];
            while (preIndex >= 0 && nums[preIndex] > current) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = current;
        }
    }

}
