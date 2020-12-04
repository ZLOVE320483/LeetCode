package com.leetcode.interval;

import java.util.LinkedList;
import java.util.List;

/**
 *https://leetcode-cn.com/problems/interval-list-intersections/
 */
public class IntervalIntersection {

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list = new LinkedList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            int a1 = A[i][0];
            int a2 = A[i][1];
            int b1 = B[j][0];
            int b2 = B[j][1];
            if (b1 <= a2 && b2 >= a1) {
                int[] tmp = new int[] {
                    Math.max(a1, b1),
                    Math.min(a2, b2)
                };
                list.add(tmp);
            }
            if (b2 < a2) {
                j++;
            } else {
                i++;
            }
        }
        int[][] res = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }
}
