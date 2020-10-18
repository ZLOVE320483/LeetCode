package com.leetcode;

public class Main {

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        FourSumCount fourSumCount = new FourSumCount();
        System.out.println(fourSumCount.fourSumCount(A, B, C, D));
    }
}
