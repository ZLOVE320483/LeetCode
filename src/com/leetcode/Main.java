package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        NextPermutation permutation = new NextPermutation();
        int[] nums = {3, 2, 1};
        permutation.nextPermutation(nums);
        PrintUtils.printIntArray(nums);
    }
}