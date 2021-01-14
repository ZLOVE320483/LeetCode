package com.zlove.leetcode;

import com.leetcode.utils.PrintUtils;
import com.zlove.leetcode.backtrace.AllTraverse;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 3};
        List<List<Integer>> res = AllTraverse.permute(coins);
        for (List<Integer> list : res) {
            PrintUtils.printIntList(list);
        }
        System.out.println(res.size());
    }
}
