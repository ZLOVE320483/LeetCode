package com.zlove.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class OpenLock {

    public static int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>();
        for (String dead : deadends) {
            deadSet.add(dead);
        }
        Set<String> visited = new HashSet<>();
        Deque<String> deque = new ArrayDeque<>();
        visited.add("0000");
        deque.offer("0000");
        int step = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                String cur = deque.poll();
                if (target.equals(cur)) {
                    return step;
                }
                if (deadSet.contains(cur)) {
                    continue;
                }
                for (int j = 0; j < cur.length(); j++) {
                    String plus = plusOne(cur, j);
                    if (!visited.contains(plus)) {
                        visited.add(plus);
                        deque.offer(plus);
                    }
                    String minus = minusOne(cur, j);
                    if (!visited.contains(minus)) {
                        visited.add(minus);
                        deque.offer(minus);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private static String plusOne(String s, int j) {
        char[] charArray = s.toCharArray();
        if (charArray[j] == '9') {
            charArray[j] = '0';
        } else {
            charArray[j] += 1;
        }
        return new String(charArray);
    }

    private static String minusOne(String s, int j) {
        char[] charArray = s.toCharArray();
        if (charArray[j] == '0') {
            charArray[j] = '9';
        } else {
            charArray[j] -= 1;
        }
        return new String(charArray);
    }
}
