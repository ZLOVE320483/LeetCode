package com.leetcode;

public class Main {

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();
        int[] nums = {1, 2};
        swapNumbers.swapNumbers(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
