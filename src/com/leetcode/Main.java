package com.leetcode;

public class Main {

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        String[] res = permutation.permutation("abc");
        for (String s : res) {
            System.out.println(s);
        }
    }
}
