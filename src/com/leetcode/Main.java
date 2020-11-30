package com.leetcode;

import com.leetcode.window.FindAnagrams;

public class Main {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String t = "abc";
        FindAnagrams anagrams = new FindAnagrams();
        System.out.println(anagrams.findAnagrams(s, t));
    }
}