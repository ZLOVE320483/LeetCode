package com.leetcode.tree;


/**
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
