package com.leetcode.utils;

public class PrintUtils {

    public static void printIntArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            builder.append(array[i]);
            builder.append(", ");
        }
        builder.append(array[array.length - 1]);
        System.out.println(builder.toString());
    }
}
