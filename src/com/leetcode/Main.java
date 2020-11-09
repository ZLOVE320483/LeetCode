package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[][] points = {
                {3, 3},
                {5, -1},
                {-2, 4}
        };
        KClosest closest = new KClosest();
        int[][] res = closest.kClosest(points, 2);
        for (int i = 0; i < res.length; i++) {
            PrintUtils.printIntArray(res[i]);
        }
    }
}