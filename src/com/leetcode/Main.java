package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] wordArr = {"hot","dot","dog","lot","log","cog"};
        List<String> wordsList = Arrays.asList(wordArr);
        LadderLength length = new LadderLength();
        System.out.println(length.ladderLength("hit", "cog", wordsList));

    }
}