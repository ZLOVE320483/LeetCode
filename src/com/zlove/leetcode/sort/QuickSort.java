package com.zlove.leetcode.sort;

public class QuickSort {

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int pivotIndex = sort(nums, left, right);
        quickSort(nums, left, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, right);
    }

    private static int sort(int[] nums, int left, int right) {
        int leftIndex = left;
        int rightIndex = right - 1;
        int pivot = nums[right];
        while (true) {
            while (leftIndex < right && nums[leftIndex] <= pivot) {
                leftIndex++;
            }
            while (rightIndex >= left && nums[rightIndex] >= pivot) {
                rightIndex--;
            }
            if (leftIndex > rightIndex) {
                break;
            }
            swap(nums, leftIndex, rightIndex);
        }
        swap(nums, leftIndex, right);
        return leftIndex;
    }

    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
