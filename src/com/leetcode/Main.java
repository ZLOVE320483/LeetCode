package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        AllCellsDistOrder order = new AllCellsDistOrder();
        int[][] res = order.allCellsDistOrder(3, 4, 1, 1);
        for (int i = 0; i < res.length; i++) {
            PrintUtils.printIntArray(res[i]);
        }
    }
}