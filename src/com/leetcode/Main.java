package com.leetcode;

import com.leetcode.backtrack.BackTrackPermute;
import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        BackTrackPermute permute = new BackTrackPermute();
        List<List<Integer>> res = permute.permute(nums);
        for (List<Integer> list : res) {
            PrintUtils.printIntList(list);
        }
    }
}