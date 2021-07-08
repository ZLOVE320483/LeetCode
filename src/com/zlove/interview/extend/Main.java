package com.zlove.interview.extend;

import com.leetcode.utils.PrintUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        System.out.println(s1.equals(s2));
        System.out.println((s1.hashCode() == s2.hashCode()));
    }

    public static int getKthMagicNumber(int k){
        int tmp = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        while(arr.size()<k){
            int real = tmp;
            if(tmp%3==0 || tmp%5==0 || tmp%7==0){
                if (tmp % 3 == 0) {
                    real /= 3;
                }
                if (tmp % 5 == 0) {
                    real /= 5;
                }
                if (tmp % 7 == 0) {
                    real /= 7;
                }
                if (arr.contains(real)) {
                    arr.add(tmp);
                }
            }
            tmp++;
        }

        PrintUtils.printIntList(arr);
        return arr.get(arr.size()-1);
    }
}
