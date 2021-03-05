package com.leetcode.list_node;

import com.leetcode.object.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/solution/dong-hua-yan-shi-82-shan-chu-pai-xu-lie-7okhz/
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        while (cur != null) {
            int repeatCount = 0;
            ListNode difNode = cur;
            while (difNode != null && difNode.val == cur.val) {
                repeatCount++;
                difNode = difNode.next;
            }
            if (repeatCount > 1) {
                pre.next = difNode;
            } else {
                pre = cur;
            }
            cur = difNode;
        }

        return dummyHead.next;
    }
}
