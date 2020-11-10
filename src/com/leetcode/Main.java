package com.leetcode;

public class Main {

    public static void main(String[] args) {
        int[][] points = {
                {8, 7},
                {9, 9},
                {7, 4},
                {9, 7}
        };
        MaxWidthOfVerticalArea area = new MaxWidthOfVerticalArea();
        System.out.println(area.maxWidthOfVerticalArea(points));
    }
}