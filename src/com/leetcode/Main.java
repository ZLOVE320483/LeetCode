package com.leetcode;

import com.leetcode.dp.MaxProfitV;

public class Main {

    public static void main(String[] args) {
        int[] prices = {1, 2};
        MaxProfitV v = new MaxProfitV();
        System.out.println(v.maxProfit_k_any(1, prices));
    }
}