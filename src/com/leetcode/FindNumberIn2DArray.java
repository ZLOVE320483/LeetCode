package com.leetcode;

public class FindNumberIn2DArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findNumberIn2DArray(matrix, 20));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int rows = matrix.length - 1, i = 0;
        while (rows >= 0 && i < matrix[0].length) {
            if (matrix[rows][i] < target) {
                i++;
            } else if (matrix[rows][i] > target) {
                rows--;
            } else {
                return true;
            }
        }
        return false;
    }
}
