package com.zlove.leetcode.dp;

public class Fibonacci {

    public static int fib1(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib1(N - 1) + fib1(N - 2);
    }

    public static int fib2(int N) {

        int[] visited = new int[N + 1];
        return helper(N, visited);
    }

    private static int helper(int N, int[] visited) {
        if (N == 1 || N == 2) {
            return 1;
        }
        if (visited[N] != 0) {
            return visited[N];
        }
        visited[N] = helper(N - 1, visited) + helper(N - 2, visited);
        return visited[N];
    }
}
