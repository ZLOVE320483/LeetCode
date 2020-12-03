package com.leetcode.dp;

import com.leetcode.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/house-robber-iii/
 */
public class RobIII {

    Map<TreeNode, Integer> visited = new HashMap<>();
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (visited.containsKey(root)) {
            return visited.get(root);
        }
        int doRob = root.val
                + (root.left == null ? 0 : rob(root.left.left) + rob(root.left.right))
                + (root.right == null ? 0 : rob(root.right.left) + rob(root.right.right));
        int doNotRob = rob(root.left) + rob(root.right);
        return Math.max(doRob, doNotRob);
    }
}
