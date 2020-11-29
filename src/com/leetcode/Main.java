package com.leetcode;

import com.leetcode.window.MinWindow;

public class Main {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinWindow minWindow = new MinWindow();
        System.out.println(minWindow.minWindow(s, t));
    }
}