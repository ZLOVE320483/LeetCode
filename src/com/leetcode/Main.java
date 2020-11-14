package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {26,21,11,20,50,34,1,18};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr1, 0, arr1.length - 1);
        PrintUtils.printIntArray(arr1);
    }
}