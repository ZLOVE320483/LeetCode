package com.leetcode;


import com.leetcode.utils.PrintUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Combine combine = new Combine();
        List<List<Integer>> res = combine.combine(4, 2);
        for (List<Integer> list : res) {
            PrintUtils.printIntList(list);
        }

    }
}