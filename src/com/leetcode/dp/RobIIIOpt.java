package com.leetcode.dp;

import com.leetcode.tree.TreeNode;

public class RobIIIOpt {

    public int rob(TreeNode root) {
        int[] res = dp(root);
        return Math.max(res[0], res[1]);
    }

    /**
     * 返回二维数组，arr[0]表示抢得到的最大钱数，arr[1]表示不抢得到的最大钱数
     * @param root
     * @return
     */
    private int[] dp(TreeNode root) {
        if (root == null) {
            return new int[]{0 , 0};
        }
        int[] left = dp(root.left);
        int[] right = dp(root.right);

        // 抢当前，下家不可抢
        int doRob = root.val + left[1] + right[1];

        // 当前不抢，下家可抢可不抢，去较大受益者
        int doNotRob = Math.max(left[0], left[1])
                + Math.max(right[0], right[1]);
        return new int[]{doRob, doNotRob};
    }
}
