package com.leetcode.nsum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return nSumTarget(nums, 4, 0, target);
    }

    private List<List<Integer>> nSumTarget(int[] nums, int n, int start, int target) {
        List<List<Integer>> res = new LinkedList<>();
        int length = nums.length;
        if (n < 2 || length < n) {
            return res;
        }
        if (n == 2) {
            int end = nums.length - 1;
            while (start < end) {
                int left = nums[start];
                int right = nums[end];
                int sum = left + right;
                if (sum < target) {
                    while (start < end && nums[start] == left) {
                        start++;
                    }
                } else if (sum > target) {
                    while (start < end && nums[end] == right) {
                        end--;
                    }
                } else {
                    List<Integer> tmp = new LinkedList<>();
                    tmp.add(left);
                    tmp.add(right);
                    res.add(tmp);
                    while (start < end && nums[start] == left) {
                        start++;
                    }
                    while (start < end && nums[end] == right) {
                        end--;
                    }
                }
            }
        } else {
            for (int i = start; i < length; i++) {
                List<List<Integer>> list = nSumTarget(nums, n - 1, i + 1, target - nums[i]);
                for (List<Integer> item : list) {
                    item.add(0, nums[i]);
                    res.add(item);
                }
                while (i < length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }

        return res;
    }
}
