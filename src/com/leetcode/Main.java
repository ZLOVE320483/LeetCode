package com.leetcode;

import com.leetcode.nsum.ThreeSum;
import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum sum = new ThreeSum();
        List<List<Integer>> res = sum.threeSum(nums);
        for (List<Integer> list : res) {
            PrintUtils.printIntList(list);
        }

    }
}