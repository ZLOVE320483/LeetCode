package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CalculateII {

    public int calculate(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }
        return helper(queue);
    }

    private int helper(Queue<Character> queue) {
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int num = 0;
        while (queue.size() > 0) {
            char c = queue.poll();
            if (isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (c == '(') {
                num = helper(queue);
            }
            if ((!isDigit(c) && c != ' ') || queue.size() == 0) {
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
            if (c == ')')
                break;
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
