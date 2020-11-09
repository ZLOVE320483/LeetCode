package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode-cn.com/problems/k-closest-points-to-origin/
 */
public class KClosest {

    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt((int[] p0) -> p0[0] * p0[0] + p0[1] * p0[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}
