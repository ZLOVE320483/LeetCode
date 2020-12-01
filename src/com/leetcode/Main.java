package com.leetcode;

import com.leetcode.dp.MaxProfitI;

public class Main {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        MaxProfitI i = new MaxProfitI();
        System.out.println(i.maxProfit(prices));
    }
}