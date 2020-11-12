package com.leetcode;

/**
 * https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 */
public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int ou = 0, ji = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[ou] = A[i];
                ou += 2;
            } else {
                res[ji] = A[i];
                ji += 2;
            }
        }
        return res;
    }
}
