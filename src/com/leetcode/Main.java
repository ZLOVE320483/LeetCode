package com.leetcode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GenerateParenthesis parenthesis = new GenerateParenthesis();
        List<String> res = parenthesis.generateParenthesis(3);
        for (String s : res) {
            System.out.println(s);
        }
    }
}