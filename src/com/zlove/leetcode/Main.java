package com.zlove.leetcode;

import com.leetcode.utils.PrintUtils;
import com.zlove.leetcode.backtrace.NQueens;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> res = NQueens.solveNQueens(4);
        for (List<String> list : res) {
            PrintUtils.printStringList(list);
        }
        System.out.println(res.size());
    }
}
