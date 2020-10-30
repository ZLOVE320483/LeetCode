package com.leetcode;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) {
                        count+=2;
                    }
                    if (j == 0 || grid[i][j - 1] == 0) {
                        count+=2;
                    }
                }
            }
        }
        return count;
    }
}
