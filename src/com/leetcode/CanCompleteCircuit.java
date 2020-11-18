package com.leetcode;

public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] dp = new int[gas.length];
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            dp[i] = gas[i] - cost[i];
            total += dp[i];
        }
        if (total < 0) {
            return -1;
        }
        int index = -1;
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            if (sum + dp[i] < 0) {
                sum = 0;
                index = -1;
            } else {
                sum += dp[i];
                index = index == -1 ? i : index;
            }
        }
        return index;
    }
}
