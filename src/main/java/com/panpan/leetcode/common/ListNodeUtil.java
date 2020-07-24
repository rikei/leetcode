package com.panpan.leetcode.common;

public class ListNodeUtil {
    /**
     * 根据数组生成列表
     *
     * @param nums
     * @return
     */
    public static ListNode generateListNode(int[] nums){
        ListNode res = new ListNode(0);
        ListNode curr = res;

        for (int i = 0; i < nums.length; i++){
            ListNode node = new ListNode(nums[i]);
            curr.next = node;
            curr = curr.next;
        }

        return res;
    }

    public static void printListNode(ListNode listNode){
        ListNode curr = listNode.next;
        boolean firstNode = true;

        while (curr != null){
            if (firstNode){
                System.out.print(curr.val);
                firstNode = false;
            } else{
                System.out.print("->" + curr.val);
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void printListNode(ListNode listNode, String title){
        System.out.println("=====开始打印【" + title +"】=====");
        printListNode(listNode);
    }
}
