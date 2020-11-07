package com.leetcode;

import com.leetcode.object.ListNode;

/**
 * https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
