package com.leetcode.tree.bst;

import com.leetcode.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return treeNodeHelper(0, nums.length - 1, nums);
    }

    private TreeNode treeNodeHelper(int low, int high, int[] nums) {
        if (low > high) {
            return null;
        }
        int mid = (high - low) / 2 + low;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = treeNodeHelper(low, mid - 1, nums);
        node.right = treeNodeHelper(mid + 1, high, nums);
        return node;
    }
}
