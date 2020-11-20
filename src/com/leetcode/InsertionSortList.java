package com.leetcode;

import com.leetcode.object.ListNode;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode lastSorted = head;
        ListNode current = head.next;
        while (current != null) {
            if (lastSorted.val <= current.val) {
                lastSorted = lastSorted.next;
            } else {
                ListNode pre = dummyHead;
                while (pre.next.val <= current.val) {
                    pre = pre.next;
                }
                lastSorted.next = current.next;
                current.next = pre.next;
                pre.next = current;
            }
            current = lastSorted.next;
        }
        return dummyHead.next;
    }

}
