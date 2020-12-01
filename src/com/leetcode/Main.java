package com.leetcode;

import com.leetcode.dp.MaxProfitII;

public class Main {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        MaxProfitII ii = new MaxProfitII();
        System.out.println(ii.maxProfit(prices));
    }
}