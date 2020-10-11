package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindOcurrences {

    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        String[] source = text.split(" ");
        for (int i = 0; i < source.length - 2; i++) {
            if (first.equals(source[i]) && second.equals(source[i + 1])) {
                result.add(source[i + 2]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
