package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

    public boolean isHappy(int n) {
        int sum = sum(n);
        Set<Integer>  set = new HashSet<>();
        set.add(sum);
        while (sum != 1) {
            sum = sum(sum);
            if (set.contains(sum)) {
                break;
            }
            set.add(sum);
        }
        return sum == 1;
    }

    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int m = n % 10;
            sum += m * m;
            n = n / 10;
        }
        return sum;
    }
}
