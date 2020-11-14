package com.leetcode.sort;

public class InsertSort {

    public void insetSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int cur = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > cur) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = cur;
        }
    }
}
