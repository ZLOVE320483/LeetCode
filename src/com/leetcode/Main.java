package com.leetcode;

import com.leetcode.binarysearch.SearchRange;
import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        SearchRange range = new SearchRange();
        PrintUtils.printIntArray(range.searchRange(nums, 6));
    }
}