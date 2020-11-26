package com.leetcode;

import com.leetcode.backtrack.BackTrackPermute;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        BackTrackPermute permute = new BackTrackPermute();
        List<List<Integer>> res = permute.permute(nums);
        System.out.println(res);
    }
}