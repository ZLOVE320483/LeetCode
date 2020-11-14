package com.leetcode;

public class QuickSort {

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) return;
        int partitionIndex = partition(array, left, right);
        quickSort(array, left, partitionIndex - 1);
        quickSort(array, partitionIndex + 1, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            while (leftIndex < right && array[leftIndex] <= pivot) {
                leftIndex++;
            }
            while (rightIndex >= left && array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex > rightIndex)
                break;
            swap(array, leftIndex, rightIndex);
        }
        swap(array, leftIndex, right);
        return leftIndex;
    }

    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
