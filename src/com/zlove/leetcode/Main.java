package com.zlove.leetcode;

import com.leetcode.utils.PrintUtils;
import com.zlove.leetcode.sort.QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] nums = {13,0,3,2,87,12};
        QuickSort.quickSort(nums, 0, nums.length - 1);
        PrintUtils.printIntArray(nums);
    }
}
