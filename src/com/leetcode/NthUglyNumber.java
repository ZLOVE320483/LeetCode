package com.leetcode;

public class NthUglyNumber {

    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int min;
        for (int i = 1; i < n; i++) {
            int factory2 = ugly[index2] * 2;
            int factory3 = ugly[index3] * 3;
            int factory5 = ugly[index5] * 5;
            min = Math.min(Math.min(factory2, factory3), factory5);
            if (min == factory2) {
                index2++;
            }
            if (min == factory3) {
                index3++;
            }
            if (min == factory5) {
                index5++;
            }
            ugly[i] = min;
        }
        return ugly[n - 1];
    }

}
