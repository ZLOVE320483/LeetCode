package com.leetcode;

import com.leetcode.window.CheckInclusion;
import com.leetcode.window.MinWindow;

public class Main {

    public static void main(String[] args) {
        String s = "ab";
        String t = "eidboaoo";
        CheckInclusion checkInclusion = new CheckInclusion();
        System.out.println(checkInclusion.checkInclusion(s, t));
    }
}