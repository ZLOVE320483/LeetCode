package com.leetcode;

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        res[0] = nums[0];
        for (int i = 1; i < length; i++) {
            res[i] = res[i - 1] + nums[i];
        }
        return res;
    }
}
