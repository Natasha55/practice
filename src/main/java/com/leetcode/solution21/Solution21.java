package com.leetcode.solution21;

/*21. Merge Two Sorted Lists
https://leetcode.com/problems/merge-two-sorted-lists/description/
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists in a one sorted list. The list should be made
    by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
*/
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fin = new ListNode(0);
        ListNode prev = fin;

        while ((list1 != null) && (list2 != null)) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 == null) {
            prev.next = list2;
        }
        if (list2 == null) {
            prev.next = list1;
        }
        if ((list1 == null) && (list2 == null)) {
            prev.next = new ListNode();
        }
        return fin.next;
    }
}

