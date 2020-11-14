package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {26,21,11,20,50,34,1,18};
        int[] arr2 = {21,11,26,20};
        RelativeSortArray sortArray = new RelativeSortArray();
        int[] res = sortArray.relativeSortArray(arr1, arr2);
        PrintUtils.printIntArray(res);
    }
}