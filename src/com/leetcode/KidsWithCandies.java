package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    /**
     * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int c : candies) {
            res.add(c + extraCandies >= max);
        }
        return res;
    }
}
