package com.leetcode;

public class BubbleSort {

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
            printArray(array);
        }
        System.out.println("\n\n");
        printArray(array);
    }

    private void printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            builder.append(array[i]);
            builder.append(", ");
        }
        builder.append(array[array.length - 1]);
        System.out.printf(builder.toString());
        System.out.println();
    }
}
