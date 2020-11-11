package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/subsets/
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num : nums) {
            List<List<Integer>> newSubSets = new ArrayList<>();
            for (List<Integer> list : res) {
                List<Integer> newSubSet = new ArrayList<>(list);
                newSubSet.add(num);
                newSubSets.add(newSubSet);
            }
            res.addAll(newSubSets);
        }
        return res;
    }
}
