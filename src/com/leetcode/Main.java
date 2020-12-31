package com.leetcode;

import com.leetcode.sort.FindKthLargest;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        FindKthLargest largest = new FindKthLargest();
        System.out.println(largest.findKthLargest(nums, 2));
    }
}