package com.leetcode.test;

public class Fib {

    public int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public int fib2(int n) {
        int[] visited = new int[n + 1];
        return helper(visited, n);
    }

    private int helper(int[] visited, int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (visited[n] != 0) {
            return visited[n];
        }
        visited[n] = helper(visited, n - 1) + helper(visited, n - 2);
        return visited[n];
    }

}
