package com.leetcode;

public class ShipWithinDays {

    public int shipWithinDays(int[] weights, int D) {
        int left = -1, right = 0, mid = 0;
        for (int weight : weights) {
            right += weight;
            if (left < weight) {
                left = weight;
            }
        }
        while (left < right) {
            mid = left + (right - left) / 2;
            if (countTransport(weights, mid, D)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean countTransport(int[] weights, int load, int D) {
        int count = 1, sum = 0;
        for (int weight : weights) {
            sum += weight;
            if (sum > load) {
                count++;
                sum = weight;
            }
        }
        return count <= D;
    }
}
