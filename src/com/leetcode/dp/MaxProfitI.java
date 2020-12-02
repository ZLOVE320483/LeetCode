package com.leetcode.dp;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfitI {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i -1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i -1][1], -prices[i]);
        }
        return dp[n - 1][0];
    }

    public int maxProfitOpt(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + price);
            dp_i_1 = Math.max(dp_i_1, -price);
        }
        return dp_i_0;
    }
}
