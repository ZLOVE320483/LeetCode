package com.leetcode.sort;

public class QuickSortII {
    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int pivotIndex = sort(nums, left, right);
        quickSort(nums, left, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, right);
    }

    private int sort(int[] nums, int left, int right) {
        int pivot = nums[right];
        int leftIndex = left, rightIndex = right - 1;
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

    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
