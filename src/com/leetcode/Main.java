package com.leetcode;

public class Main {

    public static void main(String[] args) {
        int[] w = {2, 3, 4, 5, 9};
        int[] v = {3, 4, 5, 8, 10};
        Knapsack knapsack = new Knapsack();
        System.out.println(knapsack.getMaxValue(w, v, 20));
    }
}
