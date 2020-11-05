package com.leetcode;

public class NumJewelsInStones {

    public int numJewelsInStones(String J, String S) {
        int[] counts = new int[65];
        char[] stoneChar = S.toCharArray();
        for (char s : stoneChar) {
            counts[s - 'A']++;
        }
        int count = 0;
        char[] jarr = J.toCharArray();
        for (char j : jarr) {
            count+=counts[j - 'A'];
        }
        return count;
    }
}
