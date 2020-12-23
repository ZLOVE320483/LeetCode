package com.leetcode;

import com.leetcode.dp.CanPartition;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6};
        CanPartition partition = new CanPartition();
        System.out.println(partition.canPartition(nums));
    }
}