package com.leetcode;

/**
 * https://leetcode-cn.com/problems/living-people-lcci/
 */
public class MaxAliveYear {

    public int maxAliveYear(int[] birth, int[] death) {
        int[] lives = new int[102];
        for (int b : birth) {
            lives[b - 1900]++;
        }
        for (int d : death) {
            lives[d - 1900 + 1]--;
        }
        int[] preSum = new int[102];
        preSum[0] = lives[0];
        int maxLives = lives[0];
        int minYear = 0;
        for (int i = 1; i < lives.length; i++) {
            preSum[i] = lives[i] + preSum[i - 1];
        }
        for (int i = 0; i < preSum.length; i++) {
            if (preSum[i] > maxLives) {
                maxLives = preSum[i];
                minYear = i + 1900;
            }
        }
        return minYear;
    }
}
