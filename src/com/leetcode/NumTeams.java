package com.leetcode;

public class NumTeams {

    public int numTeams(int[] rating) {
        int count = 0;
        int length = rating.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        count++;
                    }
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
