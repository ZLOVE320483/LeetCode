package com.leetcode;

/**
 * https://leetcode-cn.com/problems/valid-mountain-array/
 */
public class ValidMountainArray {
    
    public boolean validMountainArray(int[] A) {
        int length = A.length;
        if (length < 3) {
            return false;
        }
        int maxIndex = 0;
        int max = A[0];
        for (int i = 1; i < length; i++) {
            if (max < A[i]) {
                max = A[i];
                maxIndex = i;
            }
        }
        if (maxIndex == 0 || maxIndex == length - 1) {
            return false;
        }
        for (int i = 1; i < maxIndex; i++) {
            if (A[i - 1] >= A[i]) {
                return false;
            }
        }
        for (int i = maxIndex + 1; i < length; i++) {
            if (A[i] >= A[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
