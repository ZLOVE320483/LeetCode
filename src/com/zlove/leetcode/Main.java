package com.zlove.leetcode;

import com.zlove.leetcode.dp.CoinChange;

public class Main {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(CoinChange.coinChange(coins, 11));
    }
}
