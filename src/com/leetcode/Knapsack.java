package com.leetcode;

public class Knapsack {

    public int getMaxValue(int[] w, int[] v, int capacity) {
        int wLen = w.length;
        int[][] dp = new int[wLen][capacity + 1];
        for (int k = 0; k < wLen; k++) {
            for (int c = 1; c <= capacity; c++) {
                if (k == 0) {
                    if (dp[0][c] < v[k] && w[0] <= c) {
                        dp[0][c] = v[k];
                    }
                } else {
                    if (w[k] > c) {
                        dp[k][c] = dp[k - 1][c];
                    } else {
                        int value1 = dp[k - 1][c - w[k]] + v[k];
                        int value2 = dp[k - 1][c];
                        if (value1 > value2) {
                            dp[k][c] = value1;
                        } else {
                            dp[k][c] = value2;
                        }
                    }
                }
                System.out.println(String.format("dp[%d][%d]=%d", k, c, dp[k][c]));
            }
        }
        return dp[wLen - 1][capacity];
    }
}
