package com.leetcode;

import java.util.Stack;

public class Calculate {

    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if ((!isDigit(c) && c != ' ') || i == s.length() - 1) {
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        int pre1 = stack.pop();
                        stack.push(pre1 * num);
                        break;
                    case '/' :
                        int pre2 = stack.pop();
                        stack.push(pre2 / num);
                        break;
                    default:
                        break;
                }
                sign = c;
                num = 0;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
