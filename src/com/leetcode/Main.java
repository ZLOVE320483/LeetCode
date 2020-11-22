package com.leetcode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        CombinationSum sum = new CombinationSum();
        List<List<Integer>> res = sum.combinationSum(candidates, 7);
        System.out.println("res ---> " + res);
    }
}