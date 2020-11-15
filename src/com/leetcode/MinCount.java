package com.leetcode;

public class MinCount {

    public int minCount(int[] coins) {
        int count = 0;
        for (int m : coins) {
            if (m % 2 == 0) {
                count += (m / 2);
            } else {
                count += (m / 2 + 1);
            }
        }
        return count;
    }
}
