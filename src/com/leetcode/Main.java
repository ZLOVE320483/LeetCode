package com.leetcode;

public class Main {

    public static void main(String[] args) {
        String text = "we will we will rock you";
        FindOcurrences findOcurrences = new FindOcurrences();
        String[] value = findOcurrences.findOcurrences(text, "we", "will");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
}
