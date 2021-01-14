package com.zlove.leetcode.backtrace;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AllTraverse {

    private static List<List<Integer>> res = new LinkedList<>();

    public static List<List<Integer>> permute(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        traverse(nums, deque);
        return res;
    }

    private static void traverse(int[] nums, Deque<Integer> deque) {
        if (deque.size() == nums.length) {
            res.add(new LinkedList<>(deque));
            return;
        }
        for (int num : nums) {
            if (deque.contains(num)) {
                continue;
            }
            deque.offer(num);
            traverse(nums, deque);
            deque.removeLast();
        }
    }
}
