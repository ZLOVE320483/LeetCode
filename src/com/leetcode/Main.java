package com.leetcode;

import com.leetcode.sort_test.ShellSort;
import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2, 5, 7, 9, 8};
        ShellSort.sort(nums);
        PrintUtils.printIntArray(nums);
    }
}