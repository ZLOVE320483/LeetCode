package com.leetcode;

import com.leetcode.sort.InsertSort;
import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 5, 0, 9};
        InsertSort sort = new InsertSort();
        sort.insetSort(array);
        PrintUtils.printIntArray(array);
    }
}