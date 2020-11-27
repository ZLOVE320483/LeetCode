package com.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class OpenLock {

    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>();
        for (String s : deadends) {
            deadSet.add(s);
        }
        Set<String> visited = new HashSet<>();
        Deque<String> q = new ArrayDeque<>();
        visited.add("0000");
        q.offer("0000");
        int step = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                if (target.equals(cur)) {
                    return step;
                }
                if (deadSet.contains(cur)) {
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    String plus = plusOne(cur, j);
                    if (!visited.contains(plus)) {
                        q.offer(plus);
                        visited.add(plus);
                    }
                    String minus = minusOne(cur, j);
                    if (!visited.contains(minus)) {
                        q.offer(minus);
                        visited.add(minus);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private String plusOne(String s, int j) {
        char[] charArr = s.toCharArray();
        if (charArr[j] == '9') {
            charArr[j] = '0';
        } else {
            charArr[j] += 1;
        }
        return new String(charArr);
    }

    private String minusOne(String s, int j) {
        char[] charArr = s.toCharArray();
        if (charArr[j] == '0') {
            charArr[j] = '9';
        } else {
            charArr[j] -= 1;
        }
        return new String(charArr);
    }
}
