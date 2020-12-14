package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTree {

    List<TreeNode> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        preorderTraversal(root);
        for (int i = 1; i < list.size(); i++) {
            TreeNode preNode = list.get(i - 1), cur = list.get(i);
            preNode.left = null;
            preNode.right = cur;
        }
    }

    private void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
