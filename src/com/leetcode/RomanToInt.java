package com.leetcode;

public class RomanToInt {

    public int romanToInt(String s) {
        int result = 0;
        int preValue = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curValue = getValue(s.charAt(i));
            if (preValue < curValue) {
                result -= preValue;
            } else {
                result += preValue;
            }
            preValue = curValue;
        }
        result += preValue;
        return result;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
