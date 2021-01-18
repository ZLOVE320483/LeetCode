package com.zlove.leetcode.bfs;

import com.leetcode.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinDepth {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
