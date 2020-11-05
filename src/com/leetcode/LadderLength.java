package com.leetcode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/word-ladder/
 */
public class LadderLength {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordsSet = new HashSet<>(wordList);
        if (wordsSet.size() == 0 || !wordsSet.contains(endWord)) {
            return 0;
        }
        wordsSet.remove(beginWord);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            for (int i = 0; i < curSize; i++) {
                String curWord = queue.poll();
                if (changeEveryWordMatched(curWord, endWord, queue, visited, wordsSet)) {
                    return step + 1;
                }
            }
            step++;
        }
        return visited.contains(endWord) ? step : 0;
    }

    private boolean changeEveryWordMatched(String curWord, String endWord,
                                           Queue<String> queue, Set<String> visited, Set<String> wordsSet) {
        char[] curWordChar = curWord.toCharArray();
        for (int i = 0; i < endWord.length(); i++) {
            char originChar = curWordChar[i];
            for (char k = 'a'; k <= 'z'; k++) {
                if (k == originChar) {
                    continue;
                }
                curWordChar[i] = k;
                String nextWord = String.valueOf(curWordChar);
                if (wordsSet.contains(nextWord)) {
                    if (nextWord.equals(endWord)) {
                        return true;
                    }
                    if (!visited.contains(nextWord)) {
                        queue.add(nextWord);
                        visited.add(nextWord);
                    }
                }
            }
            curWordChar[i] = originChar;
        }
        return false;
    }

}
