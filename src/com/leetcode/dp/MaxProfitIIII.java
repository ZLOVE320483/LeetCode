package com.leetcode.dp;

public class MaxProfitIIII {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            int tmp = dp_i_0;
            dp_i_0 = Math.max(tmp, dp_i_1 + price);
            dp_i_1 = Math.max(dp_i_1, tmp - price - fee);
        }
        return dp_i_0;
    }
}
