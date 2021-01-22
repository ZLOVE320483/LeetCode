package com.zlove.leetcode;

import com.leetcode.utils.PrintUtils;
import com.zlove.leetcode.sort.SelectSort;

public class Main {

    public static void main(String[] args) {
        int[] nums = {13,0,3,2,87,12};
        SelectSort.sort(nums);
        PrintUtils.printIntArray(nums);
    }
}
