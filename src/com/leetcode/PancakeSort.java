package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class PancakeSort {

    private List<Integer> res = new LinkedList<>();

    public List<Integer> pancakeSort(int[] arr) {
        sort(arr, arr.length);
        return res;
    }

    private void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        reverse(arr, 0, maxIndex);
        res.add(maxIndex + 1);

        reverse(arr, 0, n - 1);
        res.add(n);

        sort(arr, n - 1);
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
