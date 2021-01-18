package com.zlove.leetcode;

import com.zlove.leetcode.bfs.OpenLock;

public class Main {

    public static void main(String[] args) {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        System.out.println(OpenLock.openLock(deadends, target));
    }
}
