package com.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/maximum-number-of-coins-you-can-get/
 */
public class MaxCoins {

    public int maxCoins(int[] piles) {
        int result = 0;
        int count = piles.length / 3;
        int c = 0;
        int index = piles.length - 2;
        Arrays.sort(piles);
        while (c < count) {
            result += piles[index];
            index -= 2;
            c++;
        }
        return result;
    }
}
