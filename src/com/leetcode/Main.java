package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        SortArrayByParityII ii = new SortArrayByParityII();
        int[] res = ii.sortArrayByParityII(nums);
        PrintUtils.printIntArray(res);
    }
}