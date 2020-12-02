package com.leetcode.dp;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class MaxProfitII {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[0][0] = 0;
                dp[0][1] = -prices[0];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
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
            int tmp = dp_i_0;
            dp_i_0 = Math.max(tmp, dp_i_1 + price);
            dp_i_1 = Math.max(dp_i_1, tmp - price);
        }
        return dp_i_0;
    }
}
