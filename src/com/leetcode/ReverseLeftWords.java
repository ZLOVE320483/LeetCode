package com.leetcode;

public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        String left = s.substring(0, n);
        String right = s.substring(n);
        return right + left;
    }
}
