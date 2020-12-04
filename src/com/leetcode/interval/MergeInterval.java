package com.leetcode.interval;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/merge-intervals/
 */
public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        Deque<int[]> tmp = new ArrayDeque<>();
        tmp.add(new int[] {intervals[0][0], intervals[0][1]});
        for (int i = 1; i < intervals.length; i++) {
            int[] inter = intervals[i];
            int[] last = tmp.getLast();
            if (inter[0] <= last[1]) {
                tmp.removeLast();
                tmp.add(new int[]{last[0], Math.max(inter[1], last[1])});
            } else {
                tmp.add(new int[]{inter[0], inter[1]});
            }
        }

        List<int[]> list = new ArrayList<>(tmp);
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
