package com.leetcode;

public class FindKthPositive {

    public int findKthPositive(int[] arr, int k) {
        int[] checkArr = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            checkArr[arr[i]] = 1;
        }
        int result = 0;
        for (int i = 1; i < checkArr.length; i++) {
            if (checkArr[i] == 0) {
                result++;
            }
            if (result == k) {
                return i;
            }
        }
        return 0;
    }
}
