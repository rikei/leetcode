package com.panpan.leetcode;

import com.panpan.leetcode.common.ListNode;
import com.panpan.leetcode.common.ListNodeUtil;

public class LeetCode0002 {
    public static void main(String[] args) {
        ListNode l1 = ListNodeUtil.generateListNode(new int[]{1,2,3,4,5});

        ListNode l2 = ListNodeUtil.generateListNode(new int[]{1,2,3,4,5});

        ListNodeUtil.printListNode(l1, "l1");
        ListNodeUtil.printListNode(l2, "l2");

        ListNode res = new LeetCode0002().addTwoNumbers(l1, l2);

        ListNodeUtil.printListNode(res, "res");

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode curr = root;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;

            ListNode sumNode = new ListNode(sumVal % 10);
            carry = sumVal / 10;

            curr.next = sumNode;
            curr = sumNode;

            if (l1!= null) l1 = l1.next;
            if (l2!= null) l2 = l2.next;
        }

        return root.next;
    }
}
