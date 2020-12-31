package com.leetcode.sort;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums == null) {
            return 0;
        }
        return getKth(nums, 0, nums.length - 1, nums.length - k + 1);
    }

    private int getKth(int[] nums, int start, int end, int k) {
        int pivot = nums[end];
        int left = start;
        int right = end;
        while (true) {
            while (nums[left] < pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && left < right) {
                right--;
            }

            if (left == right) {
                break;
            }
            swap(nums, left, right);
        }
        swap(nums, left, end);
        if (k == left + 1) {
            return nums[left];
        } else if (k < left + 1) {
           return getKth(nums, start, left - 1, k);
        } else {
            return getKth(nums, left + 1, end, k);
        }
    }

    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
