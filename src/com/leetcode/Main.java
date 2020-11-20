package com.leetcode;

public class Main {

    public static void main(String[] args) {
        int[] birth = {1900, 1901, 1950};
        int[] death = {1948, 1951, 2000};
        MaxAliveYear year = new MaxAliveYear();
        System.out.println(year.maxAliveYear(birth, death));
    }
}