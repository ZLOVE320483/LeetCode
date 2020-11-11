package com.leetcode;

import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Subsets subsets = new Subsets();
        List<List<Integer>> res = subsets.subsets(nums);
        for (List<Integer> list : res) {
            PrintUtils.printIntList(list);
        }
    }
}