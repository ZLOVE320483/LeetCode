package com.leetcode;

import com.leetcode.backtrack.SolveNQueens;
import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SolveNQueens queens = new SolveNQueens();
        List<List<String>> res = queens.solveNQueens(4);
        for (List<String> list : res) {
            System.out.println(list);
        }
    }
}