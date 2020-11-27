package com.leetcode;

import com.leetcode.bfs.OpenLock;

public class Main {

    public static void main(String[] args) {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        OpenLock openLock = new OpenLock();
        System.out.println(openLock.openLock(deadends, target));
    }
}