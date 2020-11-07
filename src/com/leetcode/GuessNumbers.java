package com.leetcode;

/**
 * https://leetcode-cn.com/problems/guess-numbers/
 */
public class GuessNumbers {

    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }
}
