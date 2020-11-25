package com.leetcode;

import com.leetcode.tree.bst.SortedArrayToBST;

public class Main {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        SortedArrayToBST bst = new SortedArrayToBST();
        bst.sortedArrayToBST(nums);
    }
}