package com.leetcode;

import com.leetcode.utils.PrintUtils;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        Shuffle shuffle = new Shuffle();
        PrintUtils.printIntArray(shuffle.shuffle(nums, 3));
    }
}
