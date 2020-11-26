package com.leetcode.utils;

import java.util.List;

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

    public static void printIntList(List<Integer> list) {
        if (list.size() == 0) {
            System.out.println("[ ]");
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            builder.append(list.get(i));
            builder.append(", ");
        }
        builder.append(list.get(list.size() - 1));
        System.out.println(builder.toString());
    }

    public static void printStringList(List<String> list) {
        if (list.size() == 0) {
            System.out.println("[ ]");
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            builder.append(list.get(i));
            builder.append(", ");
        }
        builder.append(list.get(list.size() - 1));
        System.out.println(builder.toString());
    }
}
