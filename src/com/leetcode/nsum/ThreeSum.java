package com.leetcode.nsum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            List<int[]> twoSums = twoSum(nums, i + 1, -nums[i]);
            for (int[] two : twoSums) {
                List<Integer> list = new LinkedList<>();
                list.add(nums[i]);
                list.add(two[0]);
                list.add(two[1]);
                res.add(list);
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }

    private List<int[]> twoSum(int[] nums, int start, int target) {
        List<int[]> list = new LinkedList<>();
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
                list.add(new int[] {left, right});
                while (start < end && nums[start] == left) {
                    start++;
                }
                while (start < end && nums[end] == right) {
                    end--;
                }
            }
        }
        return list;
    }
}
