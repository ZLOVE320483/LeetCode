package com.leetcode;

import com.leetcode.nsum.FourSum;
import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        FourSum sum = new FourSum();
        List<List<Integer>> res = sum.fourSum(nums, 0);
        for (List<Integer> list : res) {
            PrintUtils.printIntList(list);
        }

    }
}