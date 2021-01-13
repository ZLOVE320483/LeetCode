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

    public static int fib3(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        int[] dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    public static int fib4(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        int pre = 1;
        int cur = 1;
        for (int i = 3; i <= N; i++) {
            int sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return cur;
    }
}
