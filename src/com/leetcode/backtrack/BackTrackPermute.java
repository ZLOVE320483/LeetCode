package com.leetcode.backtrack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BackTrackPermute {

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        Deque<Integer> track = new ArrayDeque<>();
        backtrack(track, nums);
        return res;
    }

    private void backtrack(Deque<Integer> track, int[] nums) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int num : nums) {
            if (track.contains(num)) {
                continue;
            }
            track.add(num);
            backtrack(track, nums);
            track.removeLast();
        }
    }
}
