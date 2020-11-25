package com.leetcode;

import com.leetcode.dp.CoinChange;
import com.leetcode.test.Fib;

public class Main {

    public static void main(String[] args) {
        Fib fib = new Fib();

        long t1 = System.currentTimeMillis();
        System.out.println(fib.fib1(30));
        long t11 = System.currentTimeMillis();
        System.out.println("1111 --- " + (t11 - t1));

        long t2 = System.currentTimeMillis();
        System.out.println(fib.fib2(30));
        long t22 = System.currentTimeMillis();
        System.out.println("2222 --- " + (t22 - t2));

        CoinChange coinChange = new CoinChange();
        int[] coins = {2};
        System.out.println(coinChange.coinChange(coins, 3));
    }
}