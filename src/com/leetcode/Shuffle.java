package com.leetcode;

public class Shuffle {

    /**
     * https://leetcode-cn.com/problems/shuffle-the-array/
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            res[index] = nums[i];
            index += 2;
        }
        index = 1;
        for (int i = n; i < 2 * n; i++) {
            res[index] = nums[i];
            index += 2;
        }
        return res;
    }
}
