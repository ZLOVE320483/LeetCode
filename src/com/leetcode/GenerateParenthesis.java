package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 */

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private void backtrack(List<String> list, StringBuilder builder, int left, int right, int n) {
        if (builder.length() == n * 2) {
            list.add(builder.toString());
            return;
        }
        if (left < n) {
            builder.append('(');
            backtrack(list, builder, left + 1, right, n);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (right < left) {
            builder.append(')');
            backtrack(list, builder, left, right + 1, n);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
