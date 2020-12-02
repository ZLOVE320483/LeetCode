package com.leetcode;

import com.leetcode.dp.MaxProfitIII;

public class Main {

    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};
        MaxProfitIII iii = new MaxProfitIII();
        System.out.println(iii.maxProfit(prices));
    }
}