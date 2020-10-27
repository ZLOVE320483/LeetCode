package com.leetcode;

public class SumNums {

    public int sumNums(int n) {
        return sum(3);
    }

    private int sum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
