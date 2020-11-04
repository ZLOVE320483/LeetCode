package com.leetcode;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
 */
public class SingleNumbers {

    public int[] singleNumbers(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int[] tags = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            tags[nums[i]]++;
        }
        int index = 0;
        int[] res = new int[2];
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] == 1) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}
