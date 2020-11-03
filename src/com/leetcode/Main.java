package com.leetcode;


import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permute permute = new Permute();
        List<List<Integer>> res = permute.permute(nums);
        for (int i = 0; i < res.size(); i++) {
            PrintUtils.printIntList(res.get(i));
        }
    }
}
