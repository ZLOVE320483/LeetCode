package com.leetcode;

public class LastStoneWeightII {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int half = sum / 2;
        int[][] dp = new int[stones.length + 1][half + 1];
        for(int i = 1;i<stones.length + 1;i++){
            for(int j = 1;j < half + 1;j++){
                if(stones[i-1] <= j){
                    dp[i][j] = Math.max(dp[i-1][j - stones[i-1]] + stones[i-1], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return sum - (2 * dp[stones.length][half]);
    }
}
