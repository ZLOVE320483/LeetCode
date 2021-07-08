package com.leetcode;

public class GetKthMagicNumber {

    public static int getKthMagicNumber(int k) {
       int[] res = new int[k];
       res[0] = 1;
       int index3 = 0, index5 = 0, index7 = 0;
       int dp3 = 3, dp5 = 5, dp7 = 7;
        for (int i = 1; i < k; i++) {
            int min = Math.min(Math.min(res[index3] * dp3, res[index5] * dp5), res[index7] * dp7);
            if (min == res[index3] * dp3) {
                index3++;
            }
            if (min == res[index5] * dp5) {
                index5++;
            }
            if (min == res[index7] * dp7) {
                index7++;
            }
            res[i] = min;
        }
       return res[k - 1];
    }

}
