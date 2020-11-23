package com.leetcode;

public class Main {

    public static void main(String[] args) {
        int[][] points = {
                {10,16},{2,8},{1,6},{7,12}
        };
        FindMinArrowShots shots = new FindMinArrowShots();
        System.out.println(shots.findMinArrowShots(points));
    }
}