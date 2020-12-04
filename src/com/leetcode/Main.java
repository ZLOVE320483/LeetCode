package com.leetcode;

import com.leetcode.interval.IntervalIntersection;
import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[][] A = {
                {0,2},{5,10},{13,23},{24,25}
        };
        int[][] B = {
                {1,5},{8,12},{15,24},{25,26}
        };

        IntervalIntersection interval = new IntervalIntersection();
        int[][] res = interval.intervalIntersection(A, B);

        for (int[] arr : res) {
            PrintUtils.printIntArray(arr);
        }
    }
}