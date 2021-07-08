package com.leetcode;

import com.leetcode.utils.PrintUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "b", "c", "d"));
        list.remove("b");

        PrintUtils.printStringList(list);
    }
}