package com.leetcode;


public class Main {

    public static void main(String[] args) {
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        IslandPerimeter perimeter = new IslandPerimeter();
        System.out.println(perimeter.islandPerimeter(grid));
    }
}
