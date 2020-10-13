package com.leetcode;

import java.util.Arrays;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        int length =  stones.length;
        while (stones[length - 2] != 0) {
            stones[length - 1] = stones[length - 1] - stones[length - 2];
            stones[length- 2] = 0;
            Arrays.sort(stones);
        }
        return stones[length - 1];
    }
}
